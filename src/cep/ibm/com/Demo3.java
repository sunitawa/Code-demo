package cep.ibm.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=new ArrayList<>();
list.add("sunita");
list.add("arnav");
list.add("ankit");

List<String> list1=list.stream().filter(s->s.startsWith("a")).sorted().collect(Collectors.toList());
System.out.println(list1);


	}

}

