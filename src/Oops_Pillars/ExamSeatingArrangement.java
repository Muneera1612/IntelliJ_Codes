package Oops_Pillars;

import java.util.Scanner;
public class ExamSeatingArrangement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        HallStudent[] students = new HallStudent[n];

        SeatAllocator allocator = new AutomaticSeatAllocator();

        // Input student details
        for (int i = 0; i < n; i++) {

            students[i] = new HallStudent();

            System.out.println("Enter Details of Student " + (i + 1));

            System.out.print("Register Number: ");
            students[i].setRegNo(sc.nextLine());

            System.out.print("Student Name: ");
            students[i].setName(sc.nextLine());

            System.out.print("Department: ");
            students[i].setDepartment(sc.nextLine());

            // Allocate seat
            allocator.allocateSeat(students[i]);
        }

        // Display seating arrangement
        System.out.println("\n========== EXAM SEATING ARRANGEMENT ==========");

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            students[i].displayDetails();

            System.out.println("--------------------------------");
        }

        sc.close();
    }
}

// ---------------- Encapsulation ----------------
class Student {

    private String regNo;
    private String name;
    private String department;

    // Setter Methods
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter Methods
    public String getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void displayDetails() {

        System.out.println("Register Number : " + regNo);
        System.out.println("Student Name    : " + name);
        System.out.println("Department      : " + department);
    }
}

// ---------------- Inheritance + Polymorphism ----------------
class HallStudent extends Student {

    private String hallNo;
    private int seatNo;

    public void setHallNo(String hallNo) {
        this.hallNo = hallNo;
    }

    public String getHallNo() {
        return hallNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Hall Number     : " + hallNo);
        System.out.println("Seat Number     : " + seatNo);
    }
}

// ---------------- Abstraction ----------------
abstract class SeatAllocator {

    public abstract void allocateSeat(HallStudent student);
}

// ---------------- Implementation of Abstraction ----------------
class AutomaticSeatAllocator extends SeatAllocator {

    private int currentSeat = 1;

    @Override
    public void allocateSeat(HallStudent student) {

        student.setHallNo("Hall-A");
        student.setSeatNo(currentSeat);

        currentSeat++;
    }
}