package com.jin;

public class Stud2 implements Comparable<Stud2>{
	
	int rollno, marks;
	String name;
	
	public Stud2(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud2 s) {
		return name.length() > s.name.length()? 1: -1;
	}

	
}