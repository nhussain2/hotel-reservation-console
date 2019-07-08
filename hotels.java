import java.util.ArrayList;
import java.util.Scanner;
//Mid-term Exam: Hotel Reservation System
public class hotels {
	 static Scanner sc = new Scanner(System.in);
	  public static void main(String args[])
	  {
		  //Assign Default Variable Values
		  String HotelName = "Hotel";
		  String HotelLocation = "Location" ;
		  double SinglePrice = 0;
		  double DoublePrice= 0;
		  double SuitePrice= 0;
		  double SalesTaxCalc= 0;
		  String SalesTax = "0";
		  String Date = "Date";
	      String answer = "";
	      ArrayList record = new ArrayList();
	      
		  //Display Program Title
		  System.out.println("Welcome to Northwoods Hotel Reservation System");
		  // ADD LOOP HERE TO CYCLE THE HOTEL RESERVATION SYSTEM
		  do  {
		  //Enter Name
		  System.out.println("Please enter your name");
		  String name = sc.next();
		  //Prompt user for entering hotels
		  System.out.println("We offer the following hotels:");
		  System.out.println("1. Ritz Carlton (Chicago, IL)");
		  System.out.println("2. Comfort Inn (Madison, WI)");
		  System.out.println("3. Hyatt (Los Angeles, CA)");
		  System.out.println("4. The View Hotel (Sussex, UK)");
		  System.out.println("5. Grand Hotel (Macklinac, MI)");
		  System.out.println("6. Plaza Hotel (New York, NY)");
		  System.out.println();
		  System.out.println("Choose your hotel and enter the hotel number below:");
		  int HotelNum = sc.nextInt();
		  
		  //add conditions to assign hotels and locations
		  if (HotelNum == 1)
		  {
			  HotelName = "Ritz Carlton";
		      HotelLocation = "Chicago, IL";
		      SalesTaxCalc = 0.09;
		      SalesTax = "Sales Tax = 9%";
		      SinglePrice = 200;
		      DoublePrice = 350;
		      SuitePrice = 500;

		  }
		  else if (HotelNum == 2)
		  {
		      HotelName = "Comfort Inn";
		      HotelLocation = "Madison, WI";    
		      SalesTaxCalc = 0.07;
		      SalesTax = "Sales Tax = 7%";
		      SinglePrice = 141;
		      DoublePrice = 240;
		      SuitePrice = 400;
		      
		  }
		  else if (HotelNum == 3)
		  {
			  HotelName = "Hyatt";
			  HotelLocation = "Los Angeles, CA";
			  SalesTaxCalc= 0.10;
			  SalesTax = "Sales Tax = 10%";
			  SinglePrice = 70;
		      DoublePrice = 100;
		      SuitePrice = 150;
		  }
		  else if (HotelNum == 4)
		  {
			  HotelName = "The View Hotel";
			  HotelLocation = "Sussex, UK";
			  SalesTaxCalc= 0.01;
			  SalesTax= "Sales Tax = 1%";
			  SinglePrice = 61;
		      DoublePrice = 100;
		      SuitePrice = 130;
		  }
		  else if (HotelNum == 5)
		  {
			  HotelName = "Grand Hotel";
			  HotelLocation = "Macklinac, MI";
			  SalesTaxCalc= 0.06;
			  SalesTax = "Sales Tax = 6%";
			  SinglePrice = 220;
		      DoublePrice = 380;
		      SuitePrice = 480;
		  }
		  else if (HotelNum == 6)
		  {
			  HotelName = "Plaza Hotel";
			  HotelLocation = "New York, NY";
			  SalesTaxCalc= 0.08;
			  SalesTax= "Sales Tax = 8%";
			  SinglePrice = 40;
		      DoublePrice = 60;
		      SuitePrice = 80;
		  }
		  else
			  System.out.println("You have entered an incorrect number. Please try again.");
				  
		  System.out.println("Here are your current hotel reservation details");
		  System.out.println(name);
		  System.out.println(HotelName);
		  System.out.println(HotelLocation);
		  System.out.println(SalesTax);
		  System.out.println("");
		  System.out.println("Enter the date of your reservation (MM/DD/YYYY):");
		  // Enter the date
		  Date = sc.next();
		  
		  System.out.println("Choose the type of room you want to reserve:");
		  System.out.println("1. Single Room");
		  System.out.println("2. Double Room");
		  System.out.println("3. Suite Room");
		 
		  double totalCost = 0;
		  double taxTotal = 0;
		  double totalwithTax = 0;
		  int room = sc.nextInt();
		  System.out.println("Enter the number of rooms you wish to reserve");
		  double numRoom = sc.nextDouble();
		  System.out.println("Enter the number of days you wish to reserve");
		  double numDays = sc.nextDouble();
		  String RoomType = "";
		  switch(room) {
		  
		  case 1 : 
			  totalCost = SinglePrice;
			  taxTotal = SinglePrice + (SinglePrice * SalesTaxCalc);
			  totalwithTax = numDays * (numRoom * taxTotal);
			  RoomType = "Single Room";
			  break;
			  
		  case 2 :
			  totalCost = DoublePrice;
			  taxTotal = DoublePrice + (DoublePrice* SalesTaxCalc);
			  totalwithTax = numDays * (numRoom * taxTotal);
			  RoomType = "Double Room";
			  break;
			  
		  case 3 :
			  totalCost = SuitePrice;
			  taxTotal = SuitePrice + (SuitePrice * SalesTaxCalc);
			  totalwithTax = numDays * (numRoom * taxTotal);
			  RoomType = "Suite Room";
			  break;
			   }
		  System.out.println("Your Room cost is:");
		  System.out.println(totalCost);
		  System.out.println("Your cost after tax is:");
		  System.out.println(taxTotal);
		  System.out.println("Your total cost without discount is:");
		  System.out.println(totalwithTax);
		  
		  System.out.println("The following discounts are available");
		  System.out.println("1. Student Discount (5%)");
		  System.out.println("2. Senior Discount (20%)");
		  System.out.println("3. Birthday Discount (15%)");
		  System.out.println("4. Corporate Discount (25%");
		  System.out.println("5. No discount");
		  int discount = sc.nextInt();
		  double disCalc = 0;
		  String DisType = ""; 
		  switch (discount) {
		  
		  case 1:
			  disCalc = totalwithTax * 0.95;
			  DisType = "Student";
			  break;
			  
		  case 2:
			  disCalc = totalwithTax * 0.80;
			  DisType = "Senior";
			  break;
			   
		  case 3:
			  disCalc = totalwithTax * 0.85;
			  DisType = "Birthday";
			  break;
			  
		  case 4:
			  disCalc = totalwithTax * 0.75;
			  DisType = "Corporate";
			  break;
		  
		  case 5:
			  disCalc = totalwithTax * 1;
			  DisType = "No Discount";
			  break;
		  }
		  
		  System.out.println("Your final hotel Reservation details:");
		  System.out.println("____________________________________");
		  System.out.println("Name: " + name);
		  System.out.println("Hotel: " + HotelName);
		  System.out.println("Date: " + Date);
		  System.out.println("Room: " + numRoom + RoomType);
		  System.out.println("Total Cost of Rooms: " + totalwithTax );
		  System.out.println("Number of Days: " + numDays);
		  System.out.println(SalesTax);
		  System.out.println("Type Discount: " +  DisType);
		  System.out.println("Grand Total: " + disCalc);
		  System.out.println();
		  //adding all the information to record
		  
		  record.add(name);
		  record.add(HotelName);
		  record.add(numRoom);
		  record.add(RoomType);
		  record.add(totalwithTax);
		  record.add(numDays);
		  record.add(SalesTax);
		  record.add(DisType);
		  
		  
		  //for each loop
		  //store or populate array values : Name, Hotel Name, Date, Room Type, Total Cost, SalesTax, Discount
         System.out.println("Would you like to book again?"); 
		 answer = sc.next();
		  } while (answer.equalsIgnoreCase("yes"));  
		  
		  System.out.println(record);
		  
}
}

