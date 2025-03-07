package cep.ibm.com;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
class Employee{
	int id;
	String Name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1, "Sunita");
		Employee e2=new Employee(103, "Arnav");
		Employee e3=new Employee(104, "Nishad");
Set<Employee> set=new TreeSet<>();
set.add(e1);
set.add(e2);
set.add(e3);

System.out.println(set.stream().sorted((emp,emp1)->emp.getName().compareTo(emp1.getName())).collect(Collectors.toSet()));
	}

}
