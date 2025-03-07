package cep.ibm.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] A = {1,2,3,4,5,6,7,8,9};
        Integer[] B = {0,5,7,9};  
        
      Set<Integer> myset=new HashSet<>(Arrays.asList(A));
      Set<Integer> mysetb=new HashSet<>(Arrays.asList(B));
      List<Integer> list=new ArrayList<>(Arrays.asList(A));
      List<Integer> list1=new ArrayList<>(Arrays.asList(B));
      System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
      
		/*
		 * Set<Integer> setA=new HashSet<>();
		 * 
		 * Set<Integer> setB=new HashSet<>(); setA.addAll(Arrays.asList(A));
		 * setB.addAll(Arrays.asList(B));
		 */
      List<Integer> com=Stream.concat(list.stream(), list1.stream()).collect(Collectors.toList());
      System.out.println(com);

  Set<Integer> combined = Stream.concat(myset.stream(), mysetb.stream())
	        .collect(Collectors.toSet());
  System.out.println(combined);
  }
  
    
	}


