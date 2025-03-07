package com.test;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=Student.getInstance();
		Student stu2=Student.getInstance();
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
	}

}
class Student{
	static Student stu=new Student();
	
	private Student() {
		
	}
	public static Student getInstance() {
		return stu;
	}
}