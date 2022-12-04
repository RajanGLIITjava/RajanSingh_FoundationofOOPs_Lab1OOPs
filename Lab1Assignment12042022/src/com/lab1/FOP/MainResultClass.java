package com.lab1.FOP;

import java.util.Scanner;
import com.lab1.FOP.CredentialService;
import com.lab1.FOP.Department;
import com.lab1.FOP.Employee;

public class MainResultClass {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String emailId;
		String password;
		
//create emailId based on the Department
		
		String EmailTech="@gltechnicaldeptt.com";
		String EmailAdmin="@gladmindeptt.com";
		String EmailHR="@glhumanResourcedeptt.com";
		String EmailLegal="@gllegaldeptt.com";

//create password based on the Department
		
		String Techpasswod = "%"+sc.hashCode()+"@Te";
		String Adminpassword= "#!"+ "Adm" + sc.hashCode()+"^";
		String HRpassword="!Hr"+sc.hashCode()+"@";
		String Legalpassword="#!" + "Le" + sc.hashCode();
		
//intake the Department number from user

	do {	
		System.out.println("Please enter the Deptt from the Follow to allot E-mail and Pasword for your furtur references");
		System.out.println("Choose 1 → Technical Department");
		System.out.println("Choose 2 → Admin Department");
		System.out.println("Choose 3 → Human Resource Department");
		System.out.println("Choose 4 → Legal Department");
		int choose = sc.nextInt();
		
//Create Employee object and store Value
				System.out.println("Enter your First Name");
				String EmpFirstName=sc.next();
				System.out.println("Enter your Second Name");
				String EmpSecondName= sc.next();		
				//Employee employee = new Employee();
				//String finalEmployeename = employee.DisplayEmployeeName(EmpFirstName, EmpSecondName);
				String EmpFinalName = EmpFirstName +" "+ EmpSecondName;
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		
		switch(choose){
		case 0:
			{
			choose=0;
			break;
			}
		case 1:
			{
			System.out.println("Dear"+ " " + EmpFinalName + " Welcome to Gl Family");
			System.out.println("Your Department is" + "Technical Department");
			System.out.println("Your Email Address :"+ EmpSecondName + EmailTech);
			System.out.println("Your Email Password :" +Techpasswod); 
			break;
			}	
		case 2:
		{
			System.out.println("Dear"+ " " + EmpFinalName + " Welcome to Gl Family");
			System.out.println("Your Department is" + "Admin Department");
			System.out.println("Your Email Address :"+ EmpSecondName + EmailAdmin);
			System.out.println("Your Email Password :" +Adminpassword); 
			break;
			}	
		case 3:
		{
			System.out.println("Dear"+ " " + EmpFinalName + " Welcome to Gl Family");			
			System.out.println("Your Department is" + "Human Resource Department");
			System.out.println("Your Email Address :"+ EmpSecondName + EmailHR);
			System.out.println("Your Email Password :" +HRpassword); 
			break;
			}	
		case 4:
		{
			System.out.println("Dear"+ " " + EmpFinalName + " Welcome to Gl Family");	
			System.out.println("Your Department is" + "Legal Department");
			System.out.println("Your Email Address :"+ EmpSecondName + EmailLegal);
			System.out.println("Your Email Password :" +Legalpassword); 
			break;
			}	
		default:
			System.out.println("please choose Correct option");break;
		}
}while(sc.equals(null));
	System.out.println("Exited successfully");
	sc.close();
}
}
