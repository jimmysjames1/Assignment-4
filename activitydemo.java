/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author hp
 */

public class activitydemo {

    public static void main(String[] args) {
        // Labeled break statement
        labeledDemo();

        // Unlabeled break statement
        unlabeledDemo();
    }

    public static void activitydemo() {
        // Using a label to identify the loop
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Labeled : Loop terminated at i=" + i + ", j=" + j);
                    // Using labeled to terminate the outer loop when i=2 and j=2
                    break outerLoop;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }

    public static void unlabeledDemo() {
        // Unlabeled statement
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Unlabeled : Loop terminated at i=" + i + ", j=" + j);
                    // Using unlabeled to terminate the inner loop when i=2 and j=2
                    break;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }

    private static void labeledDemo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
