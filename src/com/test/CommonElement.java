package com.test;

import java.util.ArrayList;
import java.util.List;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list1=new ArrayList<>();
list1.add(2);
list1.add(1);
list1.add(3);

List<Integer> list2=new ArrayList<>();
list2.add(2);
list2.add(5);
list2.add(3);

list1.retainAll(list2);
System.out.println(list1);

	}

}
