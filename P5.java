// 5.	Write a java program using compile time polymorphism (method overloading) to compare two strings. 
// The program should implement two different versions of strcmp the first version of usrstrcmp () that compares 
// two string the second version should compare only specified number of characters from first string with 
// second string and display the results. 

import java.util.Scanner;
public class P5 
{
 public void compare(String s1, String s2)
 {
 if(s1.compareTo(s2) == 0)
 {
 System.out.println("The 2 strings are same");
 }
 else
 {
 System.out.println("The 2 strings are not same");
 }
 }
 public void compare(String s1, String s2, int n)
 {
 int flag = 0;
 for(int i=0; i<n; i++)
 {
 if(s1.charAt(i) != s2.charAt(i))
 {
 flag = 1;
 }
 }
 if (flag == 0)
 {
 System.out.println("The 2 strings are same upto "+n+" characters");
 }
 else
 {
 System.out.println("The 2 strings are not same upto "+n+" characters"); 
 }
 }
 public static void main(String[] args) 
 {
 Scanner scanner = new Scanner(System.in);
 P5 obj1 = new P5();
 System.out.print("Enter the first string: ");
 String s1 = scanner.nextLine();
 System.out.print("Enter the second string: ");
 String s2 = scanner.nextLine();
 obj1.compare(s1,s2);
 System.out.print("Enter the number of characters to compare: ");
 int n = scanner.nextInt();
 obj1.compare(s1,s2,n);
 
 scanner.close();
 }
}