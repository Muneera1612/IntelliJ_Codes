package Oops_Pillars;

public class tgtbf {
    static void main() {
        Vahicle v=new Vahicle();
        v.setWheel(4,"bmw");
        v.setEngine("sdd");
        //v.getWheel();
        //v.getEngine();
        v.display();
    }
}
class Vahicle {
    private String engine;
    private int wheel;
    public String name;

    public void setEngine(String enge) {
        engine = enge;
        System.out.println("Engine is working");
    }

    public String getEngine() {
        return engine;
    }

    public void setWheel(int w, String n) {
        name = n;
        wheel = w;
    }

    public int getWheel() {
        return wheel;
    }

    public void display() {
        System.out.println("engine name :" + engine);
        System.out.println("no of wheel" + wheel);
        System.out.println("Vehicle name " + name);
    }
}
