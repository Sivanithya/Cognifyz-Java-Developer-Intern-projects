package Level2;

import java.util.ArrayList;
import java.util.Scanner;

public class PasswordStrengthChecker {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to My Password Strength Checker ");
		System.out.println("Password should have length of 8, two lowercase letters, two uppercase letters, one digit and one special character");
		
		boolean condition=true;
		while(condition)
		{
		System.out.print("Ënter the password: ");
		String pass=sc.nextLine();
		int length=pass.length();
		boolean hasLowerCase=lower(pass);
		boolean hasUpperCase=upper(pass);
		boolean hasDigit=digit(pass);
		boolean hasSpecial=special(pass);
		
		if(length>=8 && hasLowerCase && hasUpperCase && hasDigit && hasSpecial)
		{
			System.out.println("Very Strong");
		}
		else if(length<8)
		{
			System.out.println("Not strong...Password Length should be 8 or more than 8");
		}
		else if(length>=8 && !hasLowerCase && hasUpperCase && hasDigit && hasSpecial)
		{
			System.out.println("Weak..Password should have two lower case letters");
		}
		else if(length>=8 && hasLowerCase && !hasUpperCase && hasDigit && hasSpecial)
		{
			System.out.println("Very weak..Password should have two uppercase letters");
		}
		else if(length>=8 && hasLowerCase && hasUpperCase && !hasDigit && hasSpecial)
		{
			System.out.println("Not Valid..Password should have one digit");
		}
		else if(length>=8 && hasLowerCase && hasUpperCase && hasDigit && !hasSpecial)
		{
			System.out.println("Not unique..Password should have one special character");
		}
		else
		{
			System.out.println("PLease enter a valid password");
		}
		System.out.print("Do you want check another password strength?? ");
		String reply=sc.nextLine().toLowerCase();
		condition=check(reply,condition);
		
		}
		
		System.out.println("Thanks for Using my password strength checker!!!");
		sc.close();
		
	}
	public static boolean lower(String pass)
	{
		int low=0;
		for(int i=0;i<pass.length();i++)
			{
				char c=pass.charAt(i);
				if(c>='a' && c<='z')
				{
				low++;
				}
			}
		return low>=2;
	}
	public static boolean upper(String pass)
	{
		int upp=0;
		for(int i=0;i<pass.length();i++)
		{
			char c=pass.charAt(i);
			if(c>='A' && c<='Z') {
				upp++;
			}
		}
		return upp>=2;
	}
	public static boolean special(String pass)
	{
		int specialcharacter=0;
		
		ArrayList<Character> spl=new ArrayList<Character>(); 
		spl.add('!');
        spl.add('@');
        spl.add('#');
        spl.add('$');
        spl.add('%');
        spl.add('^');
        spl.add('&');
        spl.add('*');
        spl.add('(');
        spl.add(')');
        spl.add('_');
        spl.add('-');
        spl.add('=');
        spl.add('+');
        spl.add('{');
        spl.add('}');
        spl.add('[');
        spl.add(']');
        spl.add('|');
        spl.add('\\');
        spl.add(':');
        spl.add(';');
        spl.add('\'');
        spl.add('"');
        spl.add('<');
        spl.add('>');
        spl.add(',');
        spl.add('.');
        spl.add('?');
        spl.add('/');
        

        for(int i=0;i<pass.length();i++)
        {
        	char d=pass.charAt(i);
        	if(spl.contains(d))
        	{
        		specialcharacter++;
        	}
        }
        return specialcharacter>=1;

}
	public static boolean digit(String pass)
	{
		int digitcount=0;
		for(int i=0;i<pass.length();i++)
		{
			char g=pass.charAt(i);
			if(g>='0' && g<='9')
			{
				digitcount++;
			}
		}
		return digitcount>=1;
	}
	public static boolean check(String reply,boolean condition)
	{
		
		if(reply.equals("no"))
		{
			return false;
			
		}
		return condition;
		
		
		
	}
			
	
	
}
