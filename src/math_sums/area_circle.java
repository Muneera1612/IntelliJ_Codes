package math_sums;
import java.util.Scanner;
public class area_circle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int r=sc.nextInt();
        double area=r*r*(3.14);
        System.out.println("Area of circle:" + area);
    }
}
