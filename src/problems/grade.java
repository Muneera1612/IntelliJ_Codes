package problems;

import java.util.Scanner;

public class grade {
        void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            if(num>=90){
                System.out.println("Grade A");
            }
            else if(num>=75 && num<90){
                System.out.println("Grade B");
            }
            else if(num>50 && num<75){
                System.out.println("Grade C");
            }
            else{
                System.out.println("Fail");
            }
        }
    }

