/**
* @author: Mohammad Amiri
* Unit: 3
* Assignment: Computing Numbers
* Description: This program takes in two numbers through console. Then, add, produce and show the difference. 
**/
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
    // declaring veriables 
      int firstNum = 0, secondNum = 0, sum = 0, product = 0, difference = 0; 
      // Declaring variable taking input
      Scanner number = new Scanner(System.in);
      //Asking for first number input
      System.out.println("Enter 1th number:");
      firstNum = number.nextInt();
      //Asking for second number input
      System.out.println("Enter 2th number:");
      secondNum = number.nextInt();
      //Perform mathimatical operation 
      sum = firstNum + secondNum; 
      product = firstNum * secondNum;
      if (firstNum > secondNum){
          difference = firstNum - secondNum;
      } else {
          difference = secondNum - firstNum;
      }
      //Printing out
      System.out.println("Sum: " + sum);
      System.out.println("Product: " + product);
      System.out.println("Difference: " + difference);
    }
}
