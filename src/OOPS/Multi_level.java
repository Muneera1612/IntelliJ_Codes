package OOPS;

public class Multi_level {
    void main() {
        daughter s=new daughter();
        System.out.println(s.gender);
        s.print();
        Father f=new Father();
        System.out.println(f.gender);
        f.print();
    }
    class GrandFather {
        char gender ='m';
        public static void print(){
            System.out.println("I am the King");
        }
    }
    class Father extends GrandFather{
        /*public static void print(){
            System.out.println("GrandFather");
        }*/
    }
    class daughter extends Father{
        char gender='f';
        public static void print(){
            System.out.println("Grand son");
        }

    }
}
/*class Animals{
    int noLegs=4;
    public static void eat(){
        System.out.println("I am eating");
    }
    public static void walk(){
        System.out.println("I am walking");
    }
}
class Dog extends Animals{

}*/




