package Oops_Pillars;

import java.util.Scanner;
public class CGPA_Poly {
        // Method to calculate GPA
        public double calculate(double totalPoints, double totalCredits) {
            return totalPoints / totalCredits;
        }

        // Overloaded method to calculate CGPA
        public double calculate(double[] gpa) {
            double sum = 0;

            for (double x : gpa) {
                sum += x;
            }

            return sum / gpa.length;
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            CGPACalculator obj = new CGPACalculator();

            // GPA Calculation
            System.out.print("Enter Total Grade Points: ");
            double totalPoints = sc.nextDouble();

            System.out.print("Enter Total Credits: ");
            double totalCredits = sc.nextDouble();

            //double gpa = obj.calculate(totalPoints, totalCredits);

           // System.out.printf("Semester GPA = %.2f", gpa);

            // CGPA Calculation
            double[] semesterGPA = new double[8];

            System.out.println("Enter GPA of 8 Semesters:");

            for (int i = 0; i < 8; i++) {
                System.out.print("Semester " + (i + 1) + ": ");
                semesterGPA[i] = sc.nextDouble();
            }

            //double cgpa = obj.calculate(semesterGPA);

            //System.out.printf("Final CGPA = %.2f", cgpa);


        }
    }

