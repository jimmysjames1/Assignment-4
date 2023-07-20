import java.util.Scanner;
public class StudentGrades {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the full name of the student: ");
 String fullName = input.nextLine();
 System.out.print("Enter the score of the student: ");
 int score = input.nextInt();

 String grade;
 if (score >= 70) {
 grade = "A";
 } else if (score >= 69) {
 grade = "B";
 } else if (score >= 59) {
 grade = "C";
 } else if (score >= 49) {
 grade = "D";
 }else if (score >= 39) {
 grade = "F";
 } else {
 grade = "Invalid score";
 }

 System.out.println("Student: " + fullName);
 System.out.println("Grade: " + grade);
 }
}
