package com.test;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=Student.getStance();
		Student st2=Student.getStance();
		System.out.println(st1.hashCode()+"==="+st2.hashCode());
	}
}
	class Student{
	static Student st=new Student();
	private Student(){
		
	}
	public static Student getStance() {
		return st;
	}
	}
