package cep.ibm.com;

import java.util.Arrays;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input {10,0,9,89,34,8,0,0,4,}
		//Output {0,0,0,4,8,9,10,34,89}
		//Output {0,0,0,10,9,89,34,8,4,}
		//List<Integer> list=Arrays.asList(10,0,9,89,34,8,0,0,4);
		//System.out.println(list.stream());
		int a[]= {10,0,9,89,34,8,0,0,4};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}

}
