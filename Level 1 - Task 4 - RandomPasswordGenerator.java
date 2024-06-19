package Level1;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomPasswordGenerator {

	public static boolean lenOfPassword(String pass)
	{
		return pass.length()>=12;
		

	}
	public static boolean lower(String pass)
	{
		
		int low=0;
		for(int i=0;i<pass.length();i++)
		{
			char l=pass.charAt(i);
			if(l>='a' && l<='z')
			{
				low+=1;
			}
			
		}
		return low>=2;
		
	}
	public static boolean upper(String pass)
	{
		int upp=0;
		for(int i=0;i<pass.length();i++)
		{
			char u=pass.charAt(i);
			if(u>='A' && u<='Z')
			{
				upp+=1;
			}
		}
		return upp>=2;
		
	}
	public static boolean special(String pass)
	{
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
        
		int spe=0;
		for(char i:pass.toCharArray())
		{
			if(spl.contains(i))
			{
				spe+=1;
			}
		}
		return spe>=2;
		
	}
	public static boolean digit(String pass )
	{
		int digit=0;
		for(int i=0;i<pass.length();i++)
		{
				char d=pass.charAt(i);
				if(d>='0' && d<='9')
				{
						digit+=1;
				}
		}
		return digit>=2;
		
	}
	public static void main(String args[])
	{
		System.out.println("Welcome to my Random password generator");
		System.out.println("A Strong password should have length of 12 , 2 lowercase letters, 2 uppercase letters, 2 digits and 2 special characters");
		Scanner sc=new Scanner(System.in);
		boolean condition=true;
		while(condition)
		{
		System.out.print("Enter password to check:");
		String pass=sc.nextLine();
		boolean length=lenOfPassword(pass);
		boolean haslower=lower(pass);
		boolean hasupper=upper(pass);
		boolean hasspecial=special(pass);
		boolean hasdigit=digit(pass);
		
		if(length && haslower && hasupper && hasspecial && hasdigit)
		{
			System.out.println("Ypur password is Strong");
		}
		else
		{
			System.out.println("Your password is Weak");
		}
		System.out.print("Do you want to check another password??(Yes/NO)");
		String re=sc.nextLine().toLowerCase();
		if(!(re.equals("yes")))
		{
			condition=false;
		}

		}
		sc.close();
		System.out.println("Thanks for using my Password Generator!!");
		
		
		
	}
		
}
