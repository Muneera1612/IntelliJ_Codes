package OOPS;

public class Constructor {
    static void main() {
        System.out.println("Student details");
        Student s1=new Student("Muneera",34);
        s1.display();
        System.out.println("Person details");
        Person p=new Person("Parveen",20);
        p.display();
    }
}
class Student {
    String name;
    int rollno;
    //constructor
    Student (String n,int roll){
        name=n;
        rollno=roll;
    }
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Roll no :"+rollno);
    }
}
class Person{
    String name;
    int age;
    Person (String name,int age){
        this.name=name;
        this.age=age;
    }
    void display (){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}


