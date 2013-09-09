import java.io.*;
import java.util.*; 
class MPG {
     public static void main(String args[]) throws IOException
  {
//start code
   //floats
   float drove;
   float gallon;
   float mpg;   //end floats 
   Scanner keyboard = new Scanner (System.in);   
   System.out.println("Welcome!");
   System.out.println("Enter the amount of miles driven:"); //println for miles 
   drove = keyboard.nextFloat();  //set it to drove
   System.out.println("Enter how many gallons you have used on that drive:"); //println for gallons 
  	gallon = keyboard.nextfloat();//set it to gallons
   System.out.println("Miles driven: "+drove); //tells miles
   System.out.println("Gallons used: "+gallon); //tells gallons
//end code
   }//end void
}//end class