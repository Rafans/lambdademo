package com.joker.lambda.test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestOne {
	public static void main(String[] args) {
		// Java8之前,使用匿名内部类的形式
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("before java8 , too much code ");
//			}
//		}).start();
		
		
		// Java8之后,直接使用lambda表达式
		new Thread(() -> System.out.println("lambda is much better")).start();
		
		new Thread(() -> {int a = 3;
		int b = 5;
		System.out.println(3 * b);
		System.out.println(a + b);
		}).start();
				
		String[] players = {"rafa", "roger", "novak", "andy", "stan", "cilic", "del potro"};
		
		List<String> list = Arrays.asList(players);
		
		list.forEach((n) -> System.out.println(n));
		
		Collections.sort(list, (String s1, String s2) -> s1.compareTo(s2));
		System.out.println("===================================");
		list.forEach((n) -> System.out.println(n));
		// 
		String string = method("123", "456", "789");
		System.out.println(string);
	}
	
	public static String method(String... s) {
		
		StringBuffer sb = new StringBuffer();
		
		for (String string : s) {
			sb.append(string);
		}
	    //   
		return sb.toString();
	}
}
