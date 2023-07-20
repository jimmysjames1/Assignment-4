package com.mycompany.a;

import java.util.Scanner;
public class Switch{
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the first number: ");
 int num1 = input.nextInt();
 System.out.print("Enter the second number: ");
 int num2 = input.nextInt();
 int max;

 max = switch (num1 > num2 ? 1 : (num1 < num2 ? 2 : 0)) {
         case 1 -> num1;
         case 2 -> num2;
         default -> num1;
     }; // or num2, since they are equal
 System.out.println("The maximum number is: " + max);
 }
} 
