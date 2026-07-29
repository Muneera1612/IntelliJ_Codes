package Oops_Pillars;
import java.util.Scanner;
public class CGPACalculator {


    static class Student {

        private String name;
        private String regNo;
        private double cgpa;

        // Setter methods
        public void setName(String name) {
            this.name = name;
        }

        public void setRegNo(String regNo) {
            this.regNo = regNo;
        }

        public void setCGPA(double cgpa) {
            this.cgpa = cgpa;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public String getRegNo() {
            return regNo;
        }

        public double getCGPA() {
            return cgpa;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Student s = new Student();
            System.out.print("Enter Student Name: ");
            s.setName(sc.nextLine());

            System.out.print("Enter Register Number: ");
            s.setRegNo(sc.nextLine());

            double totalGPA = 0;

            // Enter GPA for 8 semesters
            for (int i = 1; i <= 8; i++) {
                System.out.print("Enter GPA for Semester " + i + ": ");
                double gpa = sc.nextDouble();
                totalGPA += gpa;
            }

            double cgpa = totalGPA / 8;

            s.setCGPA(cgpa);

            System.out.println("----- Student Details -----");
            System.out.println("Name        : " + s.getName());
            System.out.println("Register No : " + s.getRegNo());
            System.out.printf("CGPA        : %.2f", s.getCGPA());


        }
    }
}


/*import java.util.Scanner
public class CGPA_Calculator {
    static void main() {
        Scanner sc= new Scanner(System.in);
        Student std=new Student();
        System.out.println("----CGPA Calculator---");


    }



    static class Student{
        public String sub_name;
        public int regulation;
        private int credit;
        private double cgpa;
        private String reg_no;
        //setter method
        public void setCredit(int Credit){
            Credit=credit;
        }
        public void setCgpa(double CGPA){
            CGPA = cgpa;
        }
        public void setReg_no(String regno){
            regno=reg_no;
        }

*/