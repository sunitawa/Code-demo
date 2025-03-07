package cep.ibm.com;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="sunita";
String[] str1=str.split("");
Map<String,Long> map=Arrays.stream(str1).collect(Collectors.groupingBy(i->i,Collectors.counting()));
map.forEach((k,v)->{
	System.out.println(k+"==="+v);
});
	}

}
