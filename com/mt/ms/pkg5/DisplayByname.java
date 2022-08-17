package com.mt.ms.pkg5;
import java.util.Comparator;
import com.md.ms.pkg1.StudentData;
public class DisplayByname implements Comparator<StudentData>
{

	public int compare(StudentData s1, StudentData s2) {
		return 
		s2.getName().compareToIgnoreCase(s1.getName());
	}
	
}