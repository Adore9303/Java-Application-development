// 3.	Write a Java program using encapsulation and constructors to create a class to represent a complex number and perform the following operations: 
// a.	Addition of two complex numbers
// b.	Subtraction of two complex numbers
// c.	Compare two complex numbers.

import java.util.Scanner;
class ComplexNumber 
{
 private double real;
 private double imaginary;
 public ComplexNumber(double real, double imaginary) 
 {
 this.real = real;
 this.imaginary = imaginary;
 }
 public ComplexNumber add(ComplexNumber other) 
 {
 double t1 = this.real + other.real;
 double t2 = this.imaginary + other.imaginary;
 return new ComplexNumber(t1, t2);
 }
 public ComplexNumber subtract(ComplexNumber other) 
 {
 double t1 = this.real - other.real;
 double t2 = this.imaginary - other.imaginary;
 return new ComplexNumber(t1, t2);
 }
 public void increment() 
 {
 this.real++;
 this.imaginary++;
 }
 public void decrement() 
 {
 this.real--;
 this.imaginary--;
 }
 public boolean isEqual(ComplexNumber other) 
 {
 return this.real == other.real && this.imaginary == 
other.imaginary;
 }
 public void display() 
 {
 System.out.println(this.real + " + " + this.imaginary + "i");
 }
}
public class P3 
{
 public static void main(String[] args)
 {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the real and imaginary part of first Complex Number: ");
 double r1 = scanner.nextDouble();
 double i1 = scanner.nextDouble();
 System.out.print("Enter the real and imaginary part of second Complex Number: ");
 double r2 = scanner.nextDouble();
 double i2 = scanner.nextDouble();
 ComplexNumber complex1 = new ComplexNumber(r1, i1);
 ComplexNumber complex2 = new ComplexNumber(r2, i2);
 System.out.println("The two complex numbers are: ");
 complex1.display();
 complex2.display();
 System.out.println("The sum of both complex numbers is: ");
 ComplexNumber sum = complex1.add(complex2);
 sum.display();
 System.out.println("The difference of both complex numbers is: ");
 ComplexNumber diff = complex1.subtract(complex2);
 diff.display();
 System.out.println("Incrementation of first complex numbers is: ");
 complex1.increment();
 complex1.display();
 System.out.println("Decrementation of second complex numbers is: ");
 complex2.decrement();
 complex2.display();
 boolean val = complex1.isEqual(complex2);
 if(val == true)
 {
 System.out.println("The 2 complex numbers are equal"); 
 }
 else
 {
 System.out.println("The 2 complex numbers are not equal"); 
 }
 System.out.println();
 }
}
