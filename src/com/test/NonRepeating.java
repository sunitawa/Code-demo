package com.test;
public class NonRepeating {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello world hello";
char c[]=str.toCharArray();
for(int i=0;i<c.length;i++) {
	int count=0;
	for(int j=0;j<c.length;j++) {
		if(c[i]==c[j]) {
			count++;
		}
	}
	if(count==1) {
		System.out.println(c[i]);
		
}
}
}
}
