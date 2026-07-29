package OOPS;

public class Animal {
    void sound(){
        System.out.println("Making sound");
    }
//    void walk(){
//        System.out.println("I am walking");
//    }
    class Dog extends Animal{
        void walk(){
            System.out.println("Bark");
        }
    }
    void main(String[] args){
        Dog a = new Dog();
        a.sound();
        a.walk();
    }


}
