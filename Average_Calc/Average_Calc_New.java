/*  Author: Kyle
	Disc: Average_Calc :: finds the sum on num1, ... num5 and then displayes it to the user via. PrintLN.  
  Creation: Sep. 10, 2013
  Last edit: 7:40PM ET
*/
import java.io.*;
import java.util.*;
public class Average_Calc_New
{
    public static void main (String args[])
    {
    //using ints this time vs. floats. 
    //adding I: num, adv, sum, ammount;
    int num, adv, sum, ammount;
    num = adv = sum = ammount = 0; //setting all to 0.
    //adding Scaner class from util.Scanner
    Scanner keyboard = new Scanner (System.in);
    System.out.println("Finding avrage of (x) numbers");
    System.out.print("How many numbers? ");
    ammount = keyboard.nextInt();
    System.out.println("Thanks!");
    ammount = ammount + 1;
    for(int i=1; i<ammount; i++){ //start for statment
      System.out.print("Ender number: ");
      num = keyboard.nextInt();
      sum = num + sum;
    } //end for
    adv = sum / ammount; //MATH TIME
    System.out.println("Sum is: " + sum + "\n" + "ADV is " + adv); //tells sum. tels adv.
	} //end main
} //end class
