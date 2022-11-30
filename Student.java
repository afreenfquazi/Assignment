package com.practice.assignment1.student;

public class Student {
	private static int rollNo=0;
	private String studName;
	private int marksInEng;
	private int marksInMaths;
	private int marksInScience;
	public Student(String studName, int marksInEng, int marksInMaths, int marksInScience) {
		super();
		rollNo++;
		this.studName = studName;
		this.marksInEng = marksInEng;
		this.marksInMaths = marksInMaths;
		this.marksInScience = marksInScience;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	/*public void setRollNo(int rollNo) {
		Student.rollNo = rollNo;
	}*/
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getMarksInEng() {
		return marksInEng;
	}
	public void setMarksInEng(int marksInEng) {
		this.marksInEng = marksInEng;
	}
	public int getMarksInMaths() {
		return marksInMaths;
	}
	public void setMarksInMaths(int marksInMaths) {
		this.marksInMaths = marksInMaths;
	}
	public int getMarksInScience() {
		return marksInScience;
	}
	public void setMarksInScience(int marksInScience) {
		this.marksInScience = marksInScience;
	}


	@Override
	public String toString() {
		return "Student [studName=" + studName + ", marksInEng=" + marksInEng + ", marksInMaths=" + marksInMaths
				+ ", marksInScience=" + marksInScience + "]";
	}
	
	
}
