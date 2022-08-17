package com.md.ms.pkg1;
import java.util.*;
public class StudentData {
	 int Rollno;
     String name;
     int marks;
     int age;
 public  StudentData(int Rollno,String name,int marks,int age)
{
	this.Rollno=Rollno;
	this.name=name;
	this.marks=marks;
	this.age=age;
}
public int getRollno() {
	return  Rollno;
}
public void setRollno(int Rollno) {
	this.Rollno=Rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks=marks;
}
public int getAge() {
	return age;
	}
public void setAge(int age) {
	this.age=age;
}
public String toString() {
	return "StudentData[Rollno="+Rollno+",name="+name+",marks="+marks+"age="+age+"]";
}
}