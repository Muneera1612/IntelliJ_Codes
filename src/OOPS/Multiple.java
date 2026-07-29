package OOPS;

public class Multiple {
    void main() {
        Student s=new Student();

        s.persondetails();
        s.schooldetails();

    }
    interface Person{
       abstract void persondetails();
    }
    interface School{
        abstract void schooldetails();
    }
    class Student implements Person,School{
            String name="Muneera";
            int Age=23;
            String Address="Pandalur";
            int rollno=34;
            public void persondetails(){
                System.out.println("Person details");
                System.out.println(name);
                System.out.println(Age);
                System.out.println(Address);
                System.out.println(rollno);
            }
            String schoolname="DAIT";
            public void schooldetails(){
                System.out.println("School details");
                System.out.println(schoolname);
            }
    }
}
