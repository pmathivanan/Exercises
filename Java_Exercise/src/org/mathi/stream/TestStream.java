package org.mathi.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class TestStream {

	static List<Integer> integerList = new ArrayList<Integer>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		createIntegerList();
		
		Optional<Integer> findFirst = integerList.stream().filter(new Predicate<Integer>() {
		
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t == 2;
			}
		}).findFirst();		
		System.out.println(findFirst.get());
		
		boolean allMatch = integerList.stream().allMatch(x->x%2==0);
		System.out.println(allMatch);
		

		boolean anyMatch = integerList.stream().anyMatch(x->x%8==0);
		System.out.println(anyMatch);
		

		List<Integer> collect = integerList.stream().filter(x->x%4==0).collect(Collectors.toList());
		System.out.println(collect.size());
		System.out.println(collect.get(0));
		

		long count = integerList.stream().count();
		System.out.println(count);
		
		List<Integer> collect2 = integerList.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2.size());
		

		Optional<Integer> findAny = integerList.stream().findAny();
		System.out.println(findAny.get());
		
		integerList.stream().forEachOrdered(s->System.out.print(s+" "));
		
		System.out.println();
		Optional<Integer> reduce = integerList.stream().reduce((a,b)->a>b?a:b);
		System.out.println(reduce.get());
		
		Optional<Integer> max = integerList.stream().max(Comparator.comparing(Integer::intValue));
		System.out.println(max.get());
		
		Optional<Integer> min = integerList.stream().min(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
		});
		System.out.println(min.get());
		
	}

	private static void createIntegerList() {
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(3);
	}
}
