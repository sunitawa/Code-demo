package cep.ibm.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="1__sunita  2__nishad  3__arnav";
String str1[]=str.split("  ");
List<String> list = Arrays.asList("Google", "Yahoo", "Facebook", "", "Twitter", "LinkedIn");
//List<String> lo=list.stream().map(s->s.split(" ")).collect(Collectors.toList());




	}

}
