package OOPS;

class ClassObj {
    String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public void setName(String str, int num) {
        name = str;
        rollno = num;
    }

    static void main() {
        ClassObj co = new ClassObj();
        co.name="Muneera";
        co.rollno=14;
        co.display();
    }
}

