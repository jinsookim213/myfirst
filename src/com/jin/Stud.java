package com.jin;

public class Stud implements Comparable<Stud>{
	
	int rollno, marks;
	String name;
	
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud s) {
		return name.length() > s.name.length()? 1: -1;
	}

	
}