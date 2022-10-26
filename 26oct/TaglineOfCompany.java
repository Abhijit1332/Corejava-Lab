/*
Program: WAP to print tagline of company
Abhijit banerjee
@Date: 26 oct 2022  
*/

//import packages 

import java.util.*;
//declaring a class
class TaglineOfCompany
{
	//method to print full tagline
	static void Tagline(String tag)
	{
		 switch(tag)
	   {
		   //expression level
		   case "apple" ->System.out.println("Think Different");		               
           case "dell" ->System.out.println("Be Direct");		              		
           case "amazon"-> System.out.println("Work hard,have fun, make history");		               	
           default-> System.out.println("Wrong input");						
	   } 
		
	}	
		
		
	//main started
	public static void main(String args[])
	{
       // switch case with string
	   String inputTag;
	   
	    //declaring the object of scanner
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the tagline(Apple,Dell,Amazon):");
		inputTag= s.next().toLowerCase();// converting the input to lowercase
	   
	   //calling method
	  Tagline(inputTag);
	  
	  
		    
	}
		
	// end of main
}
// end of class 
