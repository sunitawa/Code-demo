package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyList {

	public static void main(String[] args) {
	
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(3);


		System.out.println(list.stream().map(n->n*5).collect(Collectors.toList()));

	}

}
