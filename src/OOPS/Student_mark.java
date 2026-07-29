package OOPS;

public class Student_mark {
    public static void main(String[]args){
        Salary s=new Salary();
        s.setSalary(58675);
        System.out.println(s.getSalary());
    }
}
/*
class Student {
    private int marks;

    public void setMarks(int mark) {
        if (mark >= 0 && mark <= 100) {
            marks = mark;
        } else {
            System.out.println("Insufficient maks");
        }
    }

    public int getMarks() {
        return marks;
    }
}*/

class Salary{
    private double salary;

    public void setSalary(double salary) {
        if(salary>0) {
            this.salary = salary;
        }
        else{
            System.out.println("Insufficient salary");
        }
    }
    public double getSalary(){
        return salary;
    }

}


