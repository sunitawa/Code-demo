package function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(12,9,3,5,6,1);
		System.out.println(list.stream().reduce(0,Integer::min));
		List<Integer> list1=list.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println(list1);
	
	List<String> str=Arrays.asList("API","String","Java");
	List<Integer> str2=str.stream().map(str1->str1.length()).collect(Collectors.toList());
	System.out.println(str2);
	}

}
