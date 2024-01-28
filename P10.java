import java.sql.Connection; import java.sql.DriverManager;
import java.sql.PreparedStatement; import java.sql.ResultSet;
import java.sql.ResultSetMetaData; import java.sql.SQLException; import java.util.Scanner;

public class P10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
// Replace these with your database details Scanner sc = new Scanner(System.in);
String jdbcUrl = "jdbc:mysql://localhost:3306/studentdata"; 
String username = "root";
String password = "damn";

try {
// Establishing the database connection
Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

// Driver Program
while (true) { System.out.println(
"1. Add student details.\n2. Display student details\n3. Delete student details\n4. Update Student Details\n");
System.out.println("Please choose an option: "); int choice = sc.nextInt();
sc.nextLine();
if (choice == 1) {
System.out.println("Please enter student's name: "); 
String namee = sc.nextLine(); 
System.out.println("Please enter student's USN: "); 
String usnn = sc.nextLine(); 
System.out.println("Please enter student's age: "); 
int agee = sc.nextInt();
System.out.println("Please enter the year of birth:");
int yobb = sc.nextInt();
System.out.println("Please enter student's marks: "); 
int markss = sc.nextInt();
 

String queryInsert = "INSERT INTO `studentrecords` (`name`, `usn`, `age`, `YOB`, `Marks`) VALUES ('"+ namee + "', '" + usnn + "', " + agee + ", "+ yobb + ", " + markss + ");";

PreparedStatement preparedStatement = connection.prepareStatement(queryInsert);
int rowsInserted = preparedStatement.executeUpdate();
} else if (choice == 2) {
// Retrieving student details
String query = "SELECT * FROM `studentrecords`"; 
PreparedStatement preparedStatement = connection.prepareStatement(query);
ResultSet resultSet = preparedStatement.executeQuery();

// Displaying student details while (resultSet.next()) {
String name = resultSet.getString("name"); 
String usn = resultSet.getString("usn"); 
int age = resultSet.getInt("age");
int yob = resultSet.getInt("YOB");
int marks = resultSet.getInt("Marks");

System.out.println("name: " + name + ", usn: " + usn + ", age: " + age + ", YearofBirth: " + yob+ ", Marks: " + marks);
}

else if (choice == 3) {
System.out.println("Please enter the USN of the student to be deleted: ");
String usndel = sc.nextLine();
 
String queryDel = "DELETE FROM studentrecord WHERE USN='" + usndel + "'";
PreparedStatement preparedStatement = connection.prepareStatement(queryDel);
int rowsDeleted = preparedStatement.executeUpdate();
} 

else if (choice == 4) {
System.out.println("Please enter the USN of the student to be updated: ");
String usnUpd = sc.nextLine(); System.out.println("Please enter the new name: "); String newName = sc.nextLine();
String updQuery = "UPDATE studentrecord SET name=? WHERE USN=?";
PreparedStatement pstmt =
connection.prepareStatement(updQuery);
pstmt.setString(1, newName); pstmt.setString(2, usnUpd);
int rowsUpdated = pstmt.executeUpdate();
} 
}
}catch (SQLException e) {
    e.printStackTrace();
   }
}
}
 
