package com.training.org;

import java.util.ArrayList;
import java.util.Scanner;

public class XYZOrg {
	public static void main(String[] args) {
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Scanner input=new Scanner (System.in);
		int falg=0;
		
		char ch;
		do {
			System.out.println("1] Add new record \n2] Display records\n3]Delete Record\n4]Update Record");
			int choice=input.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter empId");
				int id=input.nextInt();
				System.out.println("Enter name");
				String name=input.next();
				System.out.println("Enter salary");
				double sal=input.nextDouble();
				
				empList.add(new Employee(id,name,sal));
				System.out.println("Record added succesfully......");
				System.out.println("------------------------------------------");
				break;
				
			case 2:
				System.out.println("************Employee records are **********");
				for (Employee emp : empList) {
					System.out.println(emp);
				}
				System.out.println("---------------------------------------------");
				break;
			
			case 3:
				System.out.println("Enter the name to delete");
				String nm=input.next();
				
				for (int i =0; i<empList.size();i++) {
					if(empList.get(i).getEmpName().equals(nm)) {
						empList.remove(i);
						System.out.println("Record is deleted succesfully......");
						int flag = 1;
						break;
						
					}
				}
				if(falg==0) {
					System.out.println("Record is not available.......");
				}
				break;
				
		  case 4:
			  System.out.println("4.1] Update name\n4.2] Update salary\n\n");
			  int choice1=input.nextInt();
				int flag1 = 0;
				switch (choice1) {
			  case 1:
				  System.out.println("Enter the old name to replace");
				  String nmold=input.next();
				  for (int i=0; i<empList.size();i++) {
					  if(empList.get(i).getEmpName().equals(nmold)) {
						  System.out.println("Enter the new name to replace with "+nmold+" name");
						  String nmNew=input.next();
						  empList.get(i).setEmpName(nmNew);
						  System.out.println("Update the name successfully.....");
						   flag1 = 1;
						   break;
						}
				  }
				if(flag1==0)
					  System.out.println("Record not found for deleltion......");
				  break;
				  
			  case 2:
				  System.out.println("Provoide yearly increment for employee with condition");
				  
				  System.out.println("Enter the salary for condition.....");
				  int checkSal=input.nextInt();
				  
				  System.out.println("Enter increment percentage");
				  double incrementPer=input.nextDouble();
				  
				  for (int i=0; i<empList.size(); i++) {
					  if(empList.get(i).getSalary()<checkSal) {
						  empList.get(i).setSalary(empList.get(i).getSalary()*(incrementPer/100+1));
					  }
				  }
				  
				  break;
				default:
					break;
			  }
			  break;
			  
			default:
				System.out.println("Invalid Choice......");
				break;
				
			}
			System.out.println("Do yopu want to continue........");
			ch=input.next().charAt(0);
			
		}
		while(ch=='y' ||ch=='Y');
		System.out.println("I am Done");
		
		
		
		
		
		
		
//		Employee e1=new Employee();
//		System.out.println(e1);
//		
//		Employee e2= new Employee(101,"Nitin",10000);
//		System.out.println(e2);
	} 

}
