package EliteClass;

import java.util.Scanner;
public class FreqChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++) {
            int count=0;
            boolean counted=false;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    counted=true;
                    break;
                }
            }
            if(counted){
                continue;
            }
            //count frequency
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;

                }
            }
            System.out.println(str.charAt(i) + "= "+ count);
        }
    }
}
