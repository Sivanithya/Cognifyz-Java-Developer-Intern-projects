package Level1;

import java.util.Scanner;
public class Grade_Calculator {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean condition=true;
		System.out.println("Welcome to my Grade Calculator!!!");
		
		while(condition)
		{
		System.out.print("Enter the number of grades : ");
		int n=sc.nextInt();
		sc.nextLine();
		
		double avg=gradecalculate(n,sc);
		System.out.println("Average of the grades is:"+avg);
		String average=gradecal(avg);
		System.out.println("Student's grade is : "+average);
		System.out.print("Do you want to check grade calculater for another student??(Yes/No): ");
		String reply=sc.nextLine().toLowerCase();
		condition=continuecalculate(reply,condition);
		}
		
		sc.close();
	}
	public static double gradecalculate(int n,Scanner sc)
	{
		int avgarr[]=new int[n];
		double total=0.0;
		double average;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Grade "+(i+1)+": ");
			avgarr[i]=sc.nextInt();
			total=total+avgarr[i];
		}
		
		sc.nextLine();
		
		
		System.out.println("Total number of grades:"+total);
		average=total/n;
		return average;
	}
	public static String gradecal(double avg)
	{
		if(avg>=90)
		{
			return "O";
		}
		else if(avg>=80 && avg<90)
		{
			return "A+";
		}
		else if(avg>=70 && avg<80)
		{
			return "A";
		}
		else if(avg>=60 && avg<70)
		{
			return "B+";
		}
		else if(avg>=50 && avg<60)
		{
			return "B" ;
		}
		else if(avg>=40 && avg<50)
		{
			return "C";
		}
		else
		{
			return "NA";
		}
	}
	public static boolean continuecalculate(String reply, boolean condition)
	{
	if(reply.equals("no"))
	{
		condition=false;
		System.out.println("Thanks for using my Grade Calculator!!!");
	}
	return condition;
	}
	
	
}
