
import java.util.Scanner;

public class Inheritancee {

	public static void main(String[] args) {
		Officer officer=new Officer();
		officer.getdetails();
		officer.specialization();
		System.out.println("Details of Officer:");
		officer.printdetails();
		officer.printSpecialization();

		Manager manager=new Manager();
		manager.getdetails();
		manager.department();
		System.out.println("Details of Manager:");
		manager.printdetails();
		manager.printdepartment();
	}
}

class Employee{
	
	String name;
	int age;
	String phonenumber;
	float salary;
	String address;
	Scanner sc=new Scanner(System.in);
	
	void getdetails() {
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your age");
		age=sc.nextInt();
		System.out.println("Enter your phone number");
		phonenumber=sc.next();
		System.out.println("Enter your Salary");
		salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your address");
		address=sc.nextLine();
		
	}
	void printdetails(){
		
		System.out.println("Name is:"+name);
		System.out.println("age is:"+age);
		System.out.println("Phonenumber:"+phonenumber);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
		
	}
		
	}
class Officer extends Employee{
	String specialization;
	public void specialization(){
	System.out.println("Enter Specialization:");
	specialization=sc.nextLine();
	}
	public void printSpecialization(){
	System.out.println("Specialization:"+specialization);
	}
}


class Manager extends Employee{
String department;
public void department(){
System.out.println("Enter Department:");
department=sc.next();
}
public void printdepartment(){
System.out.println("Department is:"+department);
}

	}


