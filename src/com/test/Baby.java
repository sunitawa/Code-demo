package com.test;

import java.util.Arrays;

public class Baby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,8,4,5,9};
Arrays.stream(arr).sorted().forEach(System.out::println);
int max=Arrays.stream(arr).max().getAsInt();
System.out.println(max);
int min=Arrays.stream(arr).min().getAsInt();
System.out.println(min);
int sum=Arrays.stream(arr).sum();
System.out.println(sum);
long count=Arrays.stream(arr).count();
System.out.println(count);



}}
