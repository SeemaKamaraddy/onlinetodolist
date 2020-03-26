/*
 * package de.project.sample.onlinetodolist;
 * 
 * import java.io.IOException; import java.util.ArrayList; import
 * java.util.Arrays; import java.util.LinkedList; import java.util.List;
 * 
 * 
 * // Imagine you are a peer of the developer who committed this (syntactically
 * correct) Java code and asked you to review // their pull request. You work on
 * the same product but are not familiar with this piece of work or its
 * associated // requirements. // // Please use Java comments for your review
 * feedback, putting them on separate lines around the code. Do not modify the
 * // code itself.
 * 
 * public class CodeReviewTest {
 * 
 * volatile Integer totalAge = 0;
 * 
 * 
 * 1. Its not a best practice to write the business logic inside the constructor
 * - its meant for Object creation/intilisation The client calling the
 * constructor method has to wait too long to finish it Instead write a static
 * method and place the business logic there 2. Follow Single Responsibility
 * Principle - each method should have a single responsibility to carry - define
 * 4 methods for each of the responsibility as follows.
 * sumPersonsAge(personList) findMaleCount(personList)
 * findFemaleCount(personList) fetchAllPersons(personDatabase)
 * 
 * CodeReviewTest(PersonDatabase<Person> personPersonDatabase) { Person[]
 * persons = null; try { persons = personPersonDatabase.getAllPersons(); } catch
 * (IOException e) { 3. Avoid empty catch block Define a custom Exception named
 * PersonNotFoundException - should be a Runtime Exception Once exception is
 * being caught wrap the original exception in a custom Exception and throw it
 * as follows throw new PersonNotFoundException(e);
 * 
 * 
 * }
 * 
 * 4. Make use of the following code to intiliase List from an Array
 * List<Person> personsList = Arrays.asList(persons);
 * 
 * List<Person> personsList = new LinkedList();
 * 
 * for (int i = 0; i <= persons.length; i++) { personsList.add(persons[i]); }
 * 
 * 
 * 5. Use either one of the following code to calculate the sum of the ages - no
 * need of volatile keyword totalAge. The lambda combines each element
 * repeatedly until the stream is reduced to a single value. The benefit of
 * using reduce compared to the step-by-step iteration summation that you wrote
 * earlier is that the iteration is abstracted using internal iteration, which
 * enables the internal implementation to choose to perform the reduce operation
 * in parallel
 * 
 * //int totalAge = personsList.parallelStream().map((Person p) ->
 * p.getAge()).reduce(0,(a,b) -> (a+b)); //int totalAge =
 * personsList.parallelStream().map((Person p) ->
 * p.getAge()).reduce(0,Integer::sum);
 * 
 * personsList.parallelStream().forEach(person -> { totalAge += person.getAge();
 * });
 * 
 * 
 * //6. Make use of the following code to get the male and female count //long
 * malesCount = personsList.parallelStream().filter((Person p) ->
 * "MALE".equalsIgnoreCase(p.gender)).count(); //long femalesCount =
 * personsList.parallelStream().filter((Person p) ->
 * "FEMALE".equalsIgnoreCase(p.gender)).count();
 * 
 * 
 * List<Person> males = new LinkedList<>();
 * 
 * for (Person person : personsList) { switch (person.gender) { case "Female":
 * personsList.remove(person); case "Male": males.add(person); } }
 * 
 * System.out.println("Total age =" + totalAge);
 * System.out.println("Total number of females =" + personsList.size());
 * System.out.println("Total number of males =" + males.size()); } }
 * 
 * 7. Write This class in a seperate file named Person.java Inside the package
 * com.example.model
 * 
 * 
 * class Person {
 * 
 * private int age; private String firstName; private String lastName; String
 * gender;
 * 
 * 8. Provide public getter/setter methods to all private fields - so that the
 * consumer of Person class can get/set the value of private properties of
 * Person Class I suggest to change the access specifier as 'private' for the
 * gender property and also provide public getter method for the same
 * 
 * 
 * public Person(int age, String firstName, String lastName) { this.age = age;
 * this.firstName = firstName; this.lastName = lastName; }
 * 
 * public int getAge() { return age; }
 * 
 * @Override public int hashCode() { final int prime = 31; int result = 1;
 * result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
 * return result; }
 * 
 * @Override public boolean equals(Object obj) { if (obj == this) { return true;
 * } if (obj == null || obj.getClass() != this.getClass()) { return false; }
 * Person person = (Person) obj; return (lastName == person.lastName ||
 * (lastName != null && lastName.equals(person.lastName)));
 * 
 * }
 * 
 * //9. You must have to override both equals() and hashCode() method in Java
 * 
 * And equals method in Java must follow its contract with hashcode method in
 * Java as stated below.
 * 
 * 1) If two objects are equal by equals() method then there hashcode must be
 * same.
 * 
 * 2) If two objects are not equal by equals() method then there hashcode could
 * be same or different.
 * 
 * Provided a sample implementation above assuming that Person has a unique last
 * name and if one Person can be distinguished by other Person by last name If
 * not then its best to consider all parameters (firstname , lastname ,age and
 * gender) in equals and hashCode method
 * 
 * @Override public boolean equals(Object obj) { return this.lastName
 * ==((Person)obj).lastName; }
 * 
 * 
 * }
 * 
 * 10. Write this Interface in a seperate file named PersonDatabase.java Inside
 * the package com.example.repository
 * 
 * interface PersonDatabase<E> {
 * 
 * // 11. Make use of javadoc as mentioned below - place the relevant comment //
 * Also write a class which implements this Interface
 *//**
	 * This method does something extremely useful ...
	 *
	 * @throws IOException if ... happens
	 *//*
		 * Person[] getAllPersons() throws IOException;
		 * 
		 * }
		 */