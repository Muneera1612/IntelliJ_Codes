package OOPS;

public class Abstraction {
    public static void main(String[]args){
        Jeep v1=new Jeep();
        v1.start();
        v1.stop();
        Bike v2=new Bike();
        v2.start();
    }
}
abstract class Vehiclee{
    abstract void start();
    void stop(){
        System.out.println("Vehicle stoped");
    }
}
class Jeep extends Vehiclee{
    void start(){
        System.out.println("Jeep is starting");
    }
}
class Bike extends Vehiclee{
    void start(){
        System.out.println("Bike is stating");
    }
}

