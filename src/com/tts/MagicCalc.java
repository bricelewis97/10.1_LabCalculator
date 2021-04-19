package com.tts;
import java.util.Scanner;


public class MagicCalc extends Calculator{
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        //scanner class to take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int num = sc.nextInt();
        //calling square method
        int sq = calculator.square(calculator.num1);

        System.out.println("The Square of " + num + " is: " + sq);

        System.out.println ("Enter angle in degrees :");

        double degree = sc.nextDouble ();

        double radians = Math.toRadians (degree);

        System.out.println ("Sin is: " + Math.sin (radians));
        System.out.println ("Cosine is: " + Math.cos (radians));
        System.out.println ("Tangent is: " + Math.tan (radians));



    }
}
