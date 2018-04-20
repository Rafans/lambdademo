package com.joker.lambda.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class TestTwo {
	public static <T> void main(String[] args) {
		String[] atp = {"Rafael Nadal", "Novak Djokovic",  
			       "Stanislas Wawrinka",  
			       "David Ferrer","Roger Federer",  
			       "Andy Murray","Tomas Berdych",  
			       "Juan Martin Del Potro"};  
		List<String> players =  Arrays.asList(atp); 
		
		// 以前循环方式
		for (String player : players) {
			System.out.println(player + "; ");
		}
		
		// 使用lambda表达式
		players.forEach((player) -> System.out.println("name : " + player + ";"));
		
		players.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("TestTwo.main()" + t);
			}
		});
		
//		Collections.sort(players, (String s1, String s2) -> {			
//			return s1.compareTo(s2);
//		});
		
	}
}
