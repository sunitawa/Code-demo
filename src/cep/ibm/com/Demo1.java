package cep.ibm.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list=new Vector<>();
		list.add(101);
		list.add(105);
		list.add(104);

		System.out.println(list.stream().collect(Collectors.toList()));
		int arr[ ] = { 6,3,7,1,2,4,5,7,3,2,3,7,6,3 };

		Map<Integer,Long> map=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		map.forEach((k,v)->{
		if(v>1){
		System.out.println(k+"==="+v);
		}
		});
	}

}
