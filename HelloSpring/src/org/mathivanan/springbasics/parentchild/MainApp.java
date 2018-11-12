package org.mathivanan.springbasics.parentchild;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("parentchild.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      System.out.println(obj.getMessage1());
      System.out.println(obj.getMessage2());
      
      HelloIndia obj1 = (HelloIndia) context.getBean("helloIndia");
      System.out.println(obj1.getMessage1());
      System.out.println(obj1.getMessage2());
      System.out.println(obj1.getMessage3());
   }
}