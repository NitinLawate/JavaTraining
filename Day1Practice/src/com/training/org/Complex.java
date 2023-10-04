package com.training.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Complex {
	private int real;
	private int imag;

	//Default constructor
	public Complex() {
		System.out.println("Default constructor of Program1 is called");
		real = 0;
		imag = 0;
	}
	
	public Complex(int real,int imag)
	{
		System.out.println("Parameterized constructor of Program1 is called");
		this.real=real;
		this.imag=imag;
	}

	public void showComplexValues() {
		System.out.println("Complex values are "+real+" and "+imag);
	}
	
	public void acceptComplexValues()  {
//		
//		// First values
//		BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the values for real");
//		this.real=Integer.parseInt(input.readLine());
//		
//		System.out.println("Enter the values for imag");
//		this.imag=Integer.parseInt(input.readLine());
		
		//second method
	
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the values of real");
		this.real=input.nextInt();
		
		System.out.println("Enter the values of imag");
		this.imag=input.nextInt();	
		
		// Third Method
		
//		this.real = Integer.parseInt(JOptionPane.showInputDialog("Enter first vales"));
//		this.imag = Integer.parseInt(JOptionPane.showInputDialog("Enter first vales"));
//		
//		JOptionPane.showConfirmDialog(null, "values are"+ this.real+" "+this.imag);
		
		
	
	}

	public static void main(String[] args) {

		Complex c1 = new Complex();
		c1.showComplexValues();
		c1.acceptComplexValues();
		
//		Complex c2=new Complex(100,200);
//		c2.showComplexValues();
	    
		
//		for (int i=0; i<10; i++) {
//			System.out.print("I: "+i+", ");
		}
		

}

