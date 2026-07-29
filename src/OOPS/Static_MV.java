package OOPS;

/*class Static_MV {
    //static mehtod
    static String college = "DAIT";
    int id;
    String name;

    Static_MV(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name + " " + college);
    }*/

    /*static void main() {
        Static_MV s1 = new Static_MV(1, "Muneera ");
        Static_MV s2 = new Static_MV(2,"Parveen ");
        s1.display();
        s2.display();
    }
}
 */  /* // static method
    static void display(){
        System.out.println("Static method ");
    }

    static void main() {
        Static_MV.display();
    }*/
class Counter {
    //static variables
    static int count=0;
    void increament(){
        count++;
    }
    void display(){
        System.out.println("Count "+count);
    }
    static void main() {
        Counter c=new Counter();
        Counter c1=new Counter();
        c.increament();
        c1.increament();
        c1.display();
       }
   }