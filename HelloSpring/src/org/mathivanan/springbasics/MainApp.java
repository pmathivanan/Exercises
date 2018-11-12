package org.mathivanan.springbasics;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("springbasics.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      System.out.println(obj.getMessage1());
      System.out.println(obj.getMessage2());

   }
}