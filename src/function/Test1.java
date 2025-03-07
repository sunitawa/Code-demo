package function;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("cat","dog","horse");
		
		List<String> list2=list.stream().filter(list1->list1.startsWith("c")).collect(Collectors.toList());
System.out.println(list2);
String s="aabbccc";
String str[]=s.split("");
Map<String,Long> map=Arrays.stream(str).collect(Collectors.groupingBy(i->i,Collectors.counting()));
map.forEach(null);
	}

}
