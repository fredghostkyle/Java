//I suggest you get a Smart Car. 
import java.io.*;
import java.util.*; 
class MPG {
     public static void main(String args[]) throws IOException
  {
//start code
   //add floats
   float drove; //line 14-15
   float gallon; //line 16-17
   //i float mpg; //not used  
   //end floats 
   Scanner keyboard = new Scanner (System.in);   
   System.out.println("Welcome!");
   System.out.println("Enter the exact amount of miles driven:"); //println for miles 
   drove = keyboard.nextFloat();  //set it to drove
   System.out.println("Enter the exact amount of gallons you have used on that drive:"); //println for gallons 
   gallon = keyboard.nextFloat();//set it to gallons
   System.out.println("\nMiles driven: "+drove); //tells miles
   System.out.println("Gallons used: "+gallon); //tells gallons
   System.out.println("Your miles per gallon (MPG) for that drive was: "+ drove / gallon); //drove divided by gallon = MPG
   System.out.println("\nHappy driving!! "); //Goodbye!
   //i c System.out.println("http://GitHub.com/fredghostkyle/Java/tree/master/MPG to see the code"); //link to code.  
//end code
   }//end void
}//end class

// if you see "//i " that means its not needed. 
// if you see "//i c "that means its not for class :P L