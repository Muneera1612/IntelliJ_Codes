package ArrayList;

import java.util.ArrayList;
import java.util.*;
public class multiplySub {
    static void main() {
        ArrayList<Integer>array=new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int n = sc.nextInt();
        int size=sc.nextInt();
        int []arr=new int[size];
        array.add(2);
        array.add(6);
        array.add(1);
        array.add(4);
        array.add(3);
        for(int i=0;i< array.size();i++){
            System.out.println(array.get(i));
        }
        for(int i=0;i<array.size();i++){
            for(int j=i+1;j<array.size();j++){
                if(arr[i] * arr[j]==n){
                    array.get(i);
                    //array.add(i);
                }
            }
       }
        System.out.println(array);
    }

}
