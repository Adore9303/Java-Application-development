// 8.	Write a java program to read two positive integers and perform the division operation on them and display 
// the result if a user enters a positive integer and non-zero denominator. Else, If the input is negative or the 
// denominator is zero, generate negative number input and divide by zero exception to handle the scenario.

import java.util.Scanner;
public class P8 
{
 public static void main(String[] args) 
 {
 Scanner scanner = new Scanner(System.in);
 try 
 {
 System.out.print("Enter the numerator (positive): ");
 int num = scanner.nextInt();
 System.out.print("Enter the denominator (positive non-zero): ");
 int den = scanner.nextInt();
 if (num < 0 || den < 0 || den == 0) 
 {
 throw new ArithmeticException("Negative input or division by zero exception");
 }
 double res = (double) num / den;
 System.out.println("Result of division: " + res);
 } 
 catch (ArithmeticException ae) 
 {
 System.out.println("Exception: " + ae.getMessage());
 } 
 catch (Exception e) 
 {
 System.out.println("Invalid input (Expected input as Integers)");
 } 
 }
}