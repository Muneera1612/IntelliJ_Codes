package OOPS;

class Cars {
    String brand;
    String model;
    int year;
    int wheel;
    double speed;

    public void display() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
        System.out.println(wheel);
        System.out.println(speed);
    }//using  constructor for particular model and year
    public void view(String model,int year){
        System.out.println(model);
        System.out.println(year);
    }

    static void main(String[] args) {
        Cars c = new Cars();
        c.brand = "BMW";
        c.model = "car";
        c.year = 2026;
        c.speed = 102.34;
        c.wheel = 4;
        c.display();
        c.view("model",2023);
    }
}



