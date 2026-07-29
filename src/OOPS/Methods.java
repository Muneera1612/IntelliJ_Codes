package OOPS;

public class Methods {
    public static void main(String[]args){
        System.out.println(add());
        System.out.println("A is printed");
    }
//void non parameterized
    /*public static void add(){
        int a=10;
        int b=15;
        int c=a+b;
        System.out.println(c);
    }*/

    //void parameterized
    /*public static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }*/

    //non void parameterized
    /*public static int  add(int a,int b){
        int c=a+b;
        return c;
    }*/

    //non void non parameterized
    public static int add(){
        int a=10;
        int b=15;
        int c=a+b;
        return c;
    }




}
