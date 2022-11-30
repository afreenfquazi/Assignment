package com.practice.assignment1.student;

public class Standard {
	
	public void displayRollName(Student[] s, int rollNo, String name) {
		s = new Student[8];
		for(int i = 0;i<s.length;i++) {
			
		}
	
	}

	public static void main(String[] args) {
		/*Student s[] = new Student[8];
		for(int i = 0;i<s.length;i++) {
		
			s[i].setStudName("Suresh");
			s[i].setMarksInEng(95);
			s[i].setMarksInMaths(92);
			s[i].setMarksInScience(97);
			
		}*/
		Student s1 = new Student("Suresh",95,92,97);
		Student s2 = new Student("Naresh",94,92,97);
		Student s3 = new Student("Ganesh",97,92,97);
		Student s4 = new Student("Mahesh",100,99,97);
		Student s5 = new Student("Daresh",93,98,97);
		Student s6 = new Student("Faresh",96,92,97);
		Student s7 = new Student("Lakesh",99,92,97);
		Student s8 = new Student("Rakesh",91,92,97);
		System.out.println(s1);
		

	}

}
