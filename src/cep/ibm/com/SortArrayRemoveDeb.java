package cep.ibm.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayRemoveDeb {

	public static void main(String[] args) {
		/*
		 * Print 3rd largest element from an unsorted and duplicated Integer array (min
		 * size of array is 3) i/p == {3,2,9,10,22,22,9,103,4,22,103,2,1,2,3,0,5} o/p ==
		 * 10
		 */
		// TODO Auto-generated method stub
		int arr[]= {3,2,9,10,22,22,9,103,4,22,103,2,1,2,3,0,5};
		List<Integer> list=Arrays.stream(arr).boxed().sorted().distinct().collect(Collectors.toList());
		System.out.println(list.get(list.size()-3));
		
		

	}

}
