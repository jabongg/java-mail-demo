package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example {

	  public static void main(String[] args) {
	      Predicate<Student> p1 = s -> s.stuName.startsWith("S");
	      Predicate<Student> p2 = s -> s.stuAge < 28 && s.stuName.startsWith("Z");       
	      List<Student> list = getStudents();

	      /* anyMatch() method checks whether any Stream element matches
	       * the specified predicate
	       */
	      boolean b3 = list.stream().anyMatch(p1);
	      System.out.println(b3);
	      boolean b4 = list.stream().anyMatch(p2);
	      System.out.println(b4);
	   }
	  
	  public static List<Student> getStudents(){        
	       List<Student> list = new ArrayList<>();        
	       list.add(new Student(11, 28, "Lucy"));        
	       list.add(new Student(28, 27, "Kiku"));        
	       list.add(new Student(32, 30, "Dani"));        
	       list.add(new Student(49, 27, "Steve"));       
	       return list;    
	   }
}
