/*  Author: Kyle
	Disc: Average_Calc :: finds the sum on num1, ... num5 and then displayes it to the user via. PrintLN.  
  Creation: Sep. 10, 2013
  Last edit: 7:40PM ET
*/
/*
******************************************
*              NOTE                      *
*       This is NOT. NOT working         *
*    And i don't know why                *
*    SORRRYYYYYY :/                      *
******************************************
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
    for(int i=1; i<ammount; i++){ //start "for" statment
      System.out.print("Enter number: ");
      num = keyboard.nextInt();
      sum = num + sum;
    } //end for
    adv = sum / ammount + 1; //MATH TIME
//REASONS to use a float here:
//it actually flipping works!!!!! AAHAHAHAHHAHAHAHAAAHAAHAHHAHAaAAAA
    System.out.println("Sum is: " + sum + "\n" + "ADV is " + adv); //tells sum. tels adv.
	} //end main
} //end class
// if you see //i it means for you to ignore it.
// if you see //n c OR /nc its not for class.
    