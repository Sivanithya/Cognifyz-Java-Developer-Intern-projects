package Level1;

import java.util.Scanner;

public class TemperatureConverter {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Welcome to My temperature Converter!");
	 System.out.println("Here I convert celsius to fahrenheit and fahrenheit to celsius.");
	 boolean conversion=true;
	 while(conversion)
	 {
	 System.out.println("Enter f/F to convert celsius to fahrenheit or");
	 System.out.println("Enter c/C to convert fanhrenheit to celsius:");
	 char val=sc.next().charAt(0);
	 char fromtemp=Character.toLowerCase(val);
	 System.out.println("Enter your temperature:");
	 double temp=sc.nextDouble();
	 sc.nextLine();
	 TemperatureConvert(fromtemp,temp);
	 System.out.println("Do you want to convert more temperatures ,please enter Yes/No:");
	 String res=sc.nextLine();
	 String reply=res.toLowerCase();
	 if(reply.equals("yes"))
	 {
		 conversion=true;
	 }
	 else if(reply.equals("no"))
	 {
		 conversion=false;
	 }
	 else
	 {
		 System.out.println("Please enter a valid response");
	 }
	 }
	 System.out.println("Thanks a lot for using my temperature converter");
	
	 sc.close();
	 
 }
public static void TemperatureConvert(char fromtemp,double temp)
	 {
	 if(fromtemp=='f')
	 {
		 celsiustofahrenheit(temp);
	 }
	 else if(fromtemp=='c')
	 {
		 fahrentocelsius(temp);
	 }
	 else
	 {
		 System.out.println("Please enter a valid temperature character");
	 }
	 
 }
 public static void celsiustofahrenheit(double temp)
 {
	 double totemp1;
	 totemp1=temp*(9.0/5.0)+32;
	 System.out.printf("Celsius to Fahrenheit is: %.2f°F ",  totemp1);
	 }
public static void fahrentocelsius(double temp) 
{
	double totemp2;
	totemp2=(temp-32)*(5.0/9.0);
	System.out.printf("Fahrenheit to Celsius is: %.2f °C%n", totemp2);
}
}
