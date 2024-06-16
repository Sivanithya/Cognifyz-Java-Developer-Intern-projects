package Level1;

import java.util.*;

class Palindrome_checker {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		boolean conversion=true;
		System.out.println("Welcome to my palindrome checker..lets do it!!");
		while(conversion)
		{
			System.out.println("Enter a word or phrase::");
			String word=sc.nextLine();
			if(ispalindrome(word))
			{
				System.out.println(word+ " is a palindrome");
				
			}
			else
			{
				System.out.println(word+ " is not a palindrome");
			}
			System.out.println("Do you want to check another palindrome (Yes/No)");
			String reply=sc.nextLine();
			String rep=reply.toLowerCase();
			if(rep.equals("yes"))
			{
				conversion=true;
			}
			else
			{
				conversion=false;
			}
		}
		System.out.println("Thanks for Using My Palindrome Checker!!");
		
	}
	public static boolean ispalindrome(String word)
	{
			String rev="";
			String nor="";
			String low=word.toLowerCase();
		
			for(int i=0;i<low.length();i++)			
			{
				char c=low.charAt(i);
				if(Character.isLetterOrDigit(c))
				{
				nor=nor+low.charAt(i);
				}
			}
			for(int i=low.length()-1;i>=0;i--)
			{
				char d=low.charAt(i);
				if(Character.isLetterOrDigit(d)) 
				{
				rev=rev+low.charAt(i);
				}
			}
			if(rev.equals(nor)) {
				return true;
			}
			else
			{
				return false;
			}
			
	
	
	}
}
