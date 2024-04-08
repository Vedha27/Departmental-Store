package com.storedepartmentalkannan;
import java.util.*;
public class UserInterface 
{
	
	public static void main(String[] args) 
	{
		Scanner y=new Scanner(System.in);
		
		System.out.println("Enter Customer Name:");
		String custName=y.next();
		        
		System.out.println("Enter Phone Number:");
		 String PhNo=y.next();
		
		System.out.println("Enter the Street:");
		String streetName=y.next();
		
		System.out.println("Enter bill amount:");
		double billAmt=y.nextDouble();
		
		System.out.println("Enter the distance:");
		int distance=y.nextInt();
	
		CustDetails c1=new CustDetails(custName, PhNo, streetName, billAmt, distance);
		
		System.out.println("Customer Name:"+c1.getCustName());
		System.out.println("Phone Number:"+c1.getPhNo());
		System.out.println("Street Name:"+c1.getStreetName());
		
		double bonusPoints=c1.calculateBonusPoints();
		System.out.println("Bonus Point="+bonusPoints);
		
		double deliveryCharge=c1.deliveryCharge();
		System.out.println("Delivery Charge="+deliveryCharge);
	
	}
}
