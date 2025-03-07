package cep.ibm.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public  class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Map<Integer,String> map=new HashMap<>();
		int a[]= {4,2,0,1,5,6,3,10,9,10};
		List<Integer> list=Arrays.asList(4,2,0,1,5,6,3,10,9,10);
		Set<Integer> list1=list.stream().sorted().collect(Collectors.toSet());
		List<Integer> list2= new ArrayList<>();
		list2.addAll(list1);
		System.out.println(list2.get(list2.size()-2));
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);
	}

}
