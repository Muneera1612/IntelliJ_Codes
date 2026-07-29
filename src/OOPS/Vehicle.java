package OOPS;

public class Vehicle {
    public static void main(String[]args){
        Car c=new Car();
        c.start();
        c.wheel();
    }
}

class motorVehicle {
    void start(){
        System.out.println("Can start");
    }
}
class Car extends motorVehicle{
    public void wheel(){
        System.out.println("Number of wheel is 4 ");
    }
}

