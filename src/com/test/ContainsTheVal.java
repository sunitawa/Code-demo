package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainsTheVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<Integer> list=new ArrayList<>();
list.add(101);
list.add(102);
list.add(100);
list.add(105);

Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt();

System.out.println(list.contains(n));

	}

}
