# java-proggrams
import java.util.*;
class form3
{
	String branch,college;
	Scanner scan;
	String output = " ";
	public form3(String fname,String lname,String state,String city)
	{
		scan = new Scanner(System.in);
		System.out.print("enter branch :");
		branch  = scan.next();
		System.out.print("enter college :");
		college = scan.next();
		output = "firstname:"+fname+"\nlastname :"+lname+"\nstate :"+state+"\ncity :"+city+"\nbranch :"+branch+"\ncollege :"+college;
		System.out.println(output);
	}
}
class form2 
{
	String state,city;
	Scanner scan;
	public form2(String fname,String lname)
	{
		scan = new Scanner(System.in);
		System.out.print("enter state :");
		state  = scan.next();
		System.out.print("enter city :");
		city = scan.next();
		new form3(fname,lname,state,city);
	}
}
class form1
{
	String fname,lname;
	Scanner scan;
	public form1()
	{
		scan = new Scanner(System.in);
		System.out.print("enter first name :");
		fname  = scan.next();
		System.out.print("enter last name :");
		lname = scan.next();
		new form2(fname,lname);
	}
}
class student
{
	public static void main(String args[])
	{
		new form1();
	}
}
