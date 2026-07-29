package OOPS;

import java.lang.classfile.ClassFile;

public class polymorphism {
    static void main() {
        OnlineShopping os=new OnlineShopping();
        System.out.println("Charge by weight: ₹ "+os.delivery(2.0));
        System.out.println("Charge by distance: ₹ "+os.delivvery(12));
        System.out.println("Charge for express delivery: ₹ "+os.delivery(2.0,true));
       /* Calculator m=new Calculator();
        System.out.println("Add two numbers "+ m.add(5,4));
        System.out.println(("Add three numbers "+m.add(4,6,2)));
        System.out.println("Add decimal number "+m.add(3.4,4.5,56.99));*/
    }
}
//calcualtor
/*class Calculator{
   public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int add(int a,int b,int c){
       int d=a+b+c;
       return d;
    }
    public double add(double a,double b,double c){
       return a+b+c;
    }
}*/
//online shopping
class OnlineShopping {
    double delivery (double w){
        double weight=w+30;
        return weight;  //$30 per 1kg
    }
    double delivvery(int d){
        int distance=d*5;
        return distance;   //$5 per i hrs
    }
    double delivery(double weight,boolean express){
        double charge=weight*30;
        if(express){
            charge+=50;
        }
        return charge;
    }
}

