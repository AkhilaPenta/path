package com.mt.ms.pkg2;
import java.util.*;
import com.md.ms.pkg1.StudentData; 
import com.mt.ms.pkg4.StudentnotfoundException;
import com.mt.ms.pkg5.DisplayByname;
public class StudentDetails {
	public void display()
	{
		ArrayList<StudentData>list=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		int ch;
		int Rollno=0;
		int marks=0;
		int age=0;
		String name=null;
		boolean found;
		do {
			System.out.println("1 insert and display");
			System.out.println("2 sorting");
			System.out.println("3 update");
			System.out.println("4 exit");
			System.out.println("enter choice");
			ch=s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("enter Rollno");
				Rollno=s.nextInt();
				System.out.println("enter name");
				name=s1.nextLine();
				System.out.println("enter marks");
				marks=s.nextInt();
				System.out.println("enter age");
				age=s.nextInt();
				list.add(new StudentData(Rollno,name,marks,age));
				Iterator itr=list.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				break;
			case 2:
			Collections.sort(list,new  DisplayByname ());
			Iterator itr1=list.iterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
			System.out.println("");
			break;
			case 3:
				found=false;
				System.out.println("enter Rollno to update:");
				Rollno=s.nextInt();
				System.out.println("");
				ListIterator<StudentData>li=list.listIterator();
				while(li.hasNext())
				{
					StudentData st=li.next();
					if(st.getRollno()==Rollno)
					{
						System.out.println("enter new marks");
						marks=s.nextInt();
						li.set(new StudentData(Rollno,name,marks,age));
                 found=true;
					}
				}
				Iterator itr2=list.iterator();
				while(itr2.hasNext())
				{
					System.out.println(itr2.next());
		    }
				try
				{
					if(!found)
					{
						throw new StudentnotfoundException("record not found");
					}
				}
				catch(Exception e)
				{
					System.out.println("Exception found:"+e);
				}
				break;
			case 4:
				System.out.println("exit the application");
				break;
				default:
					System.out.println("invalid input");
					break;
			}
		}
		while(ch>0);
	}
}
				