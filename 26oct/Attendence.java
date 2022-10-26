/*
Program: WAP to print Attendence of student
Abhijit banerjee
@Date: 26 oct 2022  
*/

//import packages 
import java.util.*;

//declaring a class
class Attendence
//main started
{
public static void main(String args[])
{
 //declaring the object of scanner
  Scanner s= new Scanner(System.in);
  
  System.out.println("no of classes held");
  int x=s.nextInt();
  
   System.out.println("no of classes attend");
   int y=s.nextInt();
   
   //declaring a input of percentage
  float pf;
  pf=((y*100)/x);
  System.out.println(pf);
  
    if(pf>=75)
       System.out.println("eligible:"+ pf);
 
        else 
          System.out.println(" not eligible:"+ pf);
	
}

}//end of class