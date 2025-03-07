package cep.ibm.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,1,3,4,9,8};
System.out.println(Arrays.stream(a).sum());
Map<Integer,String> map=new HashMap<>();
map.put(101,"Sunita");
map.put(102,"Sachin");

for(Map.Entry m: map.entrySet()){
System.out.println(m.getKey()+"="+m.getValue());
	}
	}
}
