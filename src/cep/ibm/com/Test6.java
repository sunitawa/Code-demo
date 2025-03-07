package cep.ibm.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       
	       int a[]= {6,2,14,5,-1,-3,5,4};
	       List<Integer> list=Arrays.asList(1,3,2,4,6,8,4);
	       List<Integer> list1= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	       System.out.println(list1.get(list1.size()-1));
	}

}
