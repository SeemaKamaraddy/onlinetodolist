package de.project.sample.onlinetodolist;

public class Person {
	
	private int age;
	private String firstName;
	
	public Person(int age,String firstName) {
		this.age = age;
		this.firstName = firstName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

}
