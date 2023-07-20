/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.studentsname;

/**
 *
 * @author hp/
 */
public class Student {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter student's full name: ");
 String fullName = scanner.nextLine();

 String[] subjects = new String[5];
 double[] marks = new double[5];
 for (int i = 0; i < 5; i++) {
 System.out.print("Enter subject " + (i + 1) + " name: ");
 subjects[i] = scanner.nextLine();
 System.out.print("Enter marks for " + subjects[i] + ": ");
 marks[i] = scanner.nextDouble();
 scanner.nextLine();
 }

 System.out.println("\n--- Student Grade Report ---");
 System.out.println("Name: " + fullName);
 for (int i = 0; i < 5; i++) {
 String grade = calculateGrade(marks[i]);
 System.out.println(subjects[i] + ": " + marks[i] + " (Grade: " + grade + ")");
 }
 scanner.close();
 }

 private static String calculateGrade(double marks) {
 if (marks >= 90) {
 return "A+";
 } else if (marks >= 80) {
 return "A";
 } else if (marks >= 70) {
 return "B";
 } else if (marks >= 60) {
 return "C";
 } else if (marks >= 50) {
 return "D";
 } else {
 return "F";
 }
 }
}
