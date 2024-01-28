// 9.	Write a java program to define an interface compute with an abstract method convert, define two classes 
// which implements the compute interface and extend the convert method to convert giga bytes to bytes and Euro 
// to rupees. Declare objects for both the classes and demonstrate the conversion from giga bytes to bytes and 
// euro to rupees.

import java.util.Scanner;
interface Compute {
 double convert(double value);
}
class KBGBConverter implements Compute {
 public double convert(double kb) 
 {
 // 1 GB = 1000*1000 KB
 return (kb / (1000*1000));
 }
}
class EuroRsConverter implements Compute {
 public double convert(double euro) 
 {
 //1 Euro = 90 Rs
 return euro * 90.0;
 }
}
public class P9 {
 public static void main(String[] args) 
 {
 Scanner scanner = new Scanner(System.in);
 Compute GBConverter = new KBGBConverter();
 System.out.print("Enter number of Kilo Bytes (KBs): ");
 double kb = scanner.nextDouble();
 double gb = GBConverter.convert(kb);
 System.out.println(kb + " KB is equal to " + gb + " GB");
 Compute EuroConverter = new EuroRsConverter();
 System.out.print("Enter amount in Euros: ");
 double eur = scanner.nextDouble();
 double rs = EuroConverter.convert(eur);
 System.out.println(eur + " Euros is equal to " + rs + " Rupees");
 scanner.close();
 }
}