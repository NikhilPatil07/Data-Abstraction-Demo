package com.infogalaxy.studentIMP;

import java.util.Scanner;

public abstract  class StudentMain 
{
	 static StudentModel studentModel = new StudentModel();
	 
	 public static void setStudent()
	
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter the Student PRN ID : ");
		studentModel.setPRNID(scanner.next());
		System.out.println(" Enter the Student Name : ");
		studentModel.setName(scanner.next());
		System.out.println(" Enter the Student Roll No : ");
		studentModel.setRollNo(scanner.next());
		System.out.println(" Enter the Student Mobil No : ");
		studentModel.setMobilNo(scanner.next());
		System.out.println(" Enter the Student Address : ");
		studentModel.setAddress(scanner.next());
		
	}
	public static void getStudent()
	{
		System.out.println(" Student PRN ID : "+studentModel.getPRNID());
		System.out.println(" Student Name : "+studentModel.getName());
		System.out.println(" Student Roll NO : "+studentModel.getRollNO());
		System.out.println(" Student Mobil No : "+studentModel.getMobilNo());
		System.out.println(" Student Address : "+studentModel.getAddress());
	}
	public static void main(String[] args)
	{
		StudentModel stuentModel = new StudentModel();
		StudentMain.setStudent();
		StudentMain.getStudent();
	}
}
