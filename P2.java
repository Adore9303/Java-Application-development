// 2.	Write a java program to create an Employee database which stores following information about the Employee: Name, Emp_id, department, age, and designation. Perform the following operations:
// a.	Read and display the details of at least five Employees.
// b.	Calculate and display the sum of salary of all the employees of “sales” department.
// c.	Retrieve the details of “highest paid manager” in the purchase department.


import java.util.Scanner;
class empdetails 
{
 public String name, ID, dept, des;
 public int age;
 public double sal;
 public void getdata() 
 {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the name of the employee");
 name = scanner.nextLine();
 System.out.println("Enter the Employee ID");
 ID = scanner.nextLine();
 System.out.println("Enter the department of the employee");
 dept = scanner.nextLine();
 System.out.println("Enter the age of employee ");
 age = scanner.nextInt();
 scanner.nextLine(); // Consume the newline character left by nextInt()
 System.out.println("Enter the designation of the employee");
 des = scanner.nextLine();
 System.out.println("Enter the salary of the employee");
 sal = scanner.nextDouble();
 scanner.nextLine(); // Consume the newline character left by nextDouble()
 System.out.println();
 scanner.close();
 }
 public void printdata() 
 {
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 System.out.println("Employee ID: " + ID);
 System.out.println("Department: " + dept);
 System.out.println("Designation: " + des);
 System.out.println("Salary: " + sal);
 System.out.println();
 }
}
public class P2 
{
 public static void main(String[] args) 
 {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the number of employees: ");
 int num = scanner.nextInt();
 scanner.nextLine(); // Consume the newline character left by nextInt()
 empdetails[] employees = new empdetails[num];
 for (int i = 0; i < num; i++) 
 {
 System.out.println("Enter details for Employee " + (i+1));
 employees[i] = new empdetails();
 employees[i].getdata();
 }
 for (int i = 0; i < num; i++) 
 {
 System.out.println("Details for Employee " + (i+1));
 employees[i].printdata();
 }
 double salestotal = 0;
 for (int i = 0; i < num; i++) 
 {
 if(employees[i].dept.compareTo("sales") == 0)
 {
 salestotal = salestotal + employees[i].sal;
 }
 }
 System.out.println("Total Salary of Sales Department is "+ 
salestotal);
 double max = 0;
 int index = 0;
 for (int i = 0; i < num; i++) 
 {
 if(employees[i].dept.compareTo("purchase") == 0 & 
employees[i].des.compareTo("manager") == 0)
 {
 if(employees[i].sal > max)
 {
 max = employees[i].sal;
index = i;
 }
 }
 }
 if (max == 0)
 {
 System.out.println("There are no managers in purchase department");
 }
 else
 {
 System.out.println("Details of highest paid manager of purchase department is ");
 employees[index].printdata();
 }
 scanner.close();
 }
}
