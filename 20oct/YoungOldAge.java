/*
WAP to print age of 3 people by user and determine oldest and youngest amon them
@author : Abhijit Banerjee
@Date : 20 oct 2022
*/

//import packages

import java.util.*;
//declaring class
class YoungOldAge
{
	//main start
	public static void main(String []args)
	{
		int per1,per2,per3;
		//declaring the object of scanner
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		per1= s.nextInt();
		per2= s.nextInt();
		per3= s.nextInt();
		
		//checking the age according to younger or older
		if((per1>per2)&&(per1>per3))
		{
			if(per2>per3)
				
				{
					System.out.println("per1 is older and pre3 is younger ");
					
				}
	             else
				 {
					 System.out.println("per1 is older and per2 is younger");
				 }
		}
		else if ((per2>per3)&&(per2>per1))
		{
			if(per3>per1)
			{
				System.out.println("per2 is older and per1 is younger");
			}
			else
			{
				System.out.println("per2 is older and per3 is younger");
			}
		}
	     else
		 {
			 if(per1>per2)
			 {
				 System.out.println("per3 is older and per2 is younger");
			 }
			 else
			 {
				 System.out.println("per3 is older and per1 is younger");
			 }
		 }
			
		
			//end of ifelse
	}
//end of main
}
//end of class