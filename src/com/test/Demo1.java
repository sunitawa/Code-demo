package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,5,1,6,7,8,9};
Arrays.stream(a).sorted().forEach(System.out::println);
System.out.println("-------------------");
Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
System.out.println("++++++++++++===="+a[1]);
System.out.println("------------------------");
int number = 5;
IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y);
	}

}
