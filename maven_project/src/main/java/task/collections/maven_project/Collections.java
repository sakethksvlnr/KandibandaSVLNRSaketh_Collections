package task.collections.maven_project;
import java.io.*;
import java.util.*;

public class Collections {
	public static void main(String args[])
	{
		List<String> l=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		l.add("Raju");
		l.add("Ravi");
		l.add("Prakash");
		l.add("Venkat");
		l.add("Uday");
		l.add("Krishna");
		l.add("Anjali");
		l.add("Lucky");
		l.add("Priya");
		l.add("Gowtham");
		while(1==1)
		{
			System.out.println("Select any option\n1.Search\n2.Add\n3.Remove\n4.Display\n5.Exit");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("Enter the name to be searched:");
				String s=sc.next();
				int i=l.indexOf(s);
				if(i>=0)
				{
					System.out.println("Name is at index "+l.indexOf(s));
				}
				else
				{
					System.out.println("Name not found");
				}
				
			}
			else if(n==2)
			{
				System.out.println("Enter the name to be entered");
				String s1=sc.next();
				l.add(s1);
			}
			else if(n==3)
			{
				System.out.println("Enter the name to be removed:");
				String s2=sc.next();
				l.remove(s2);
			}
			else if(n==4)
			{
				System.out.println(l);
			}
			else
			{
				break;
			}
		}
	
		
	}


}
