package OOPS;

public class Recursive {
    public static void main(String[]args){
        natPrint(10);

    }

    public static void natPrint(int n){
        //Base Case
        if(n==1){
            System.out.println(1);
        }
        //Recursive Case
        else{
            System.out.println(n);
            natPrint(n-1);
        }
    }

}
