package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(2);
		List<Integer> list1=Arrays.asList(2,4,1,2);
		int arr[ ] = { 6,3,7,1,2,4,5,7,3,2,3,7,6,3 };
		Map<Integer,Long> map=list1.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		map.forEach((k,v)->{
			if(v>1)
		System.out.println(k+"===="+v);	
		});
	}

}
