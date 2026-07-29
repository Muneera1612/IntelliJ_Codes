package Arrays;
import java.util.Scanner;
public class Automorphic_No {
    // the multiply no end with same no
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();     //x=25;
        int temp = x;    //temp=x;
        int y = x * x;      //y=25*25=625
        boolean found = true;
        while (temp > 0) {    //25>0

            if(temp%10 != y%10){     //25%10 != 625%10
                found=false;          //found=false
                break;
            }
            temp/=10;     //temp=temp/10==25/10=2
            y/=10;        //625/10=62
        }
        if(found){
            System.out.println("Automorphic number ");
        }
        else{
            System.out.println("Not aAutomorphic number ");
        }
    }
}