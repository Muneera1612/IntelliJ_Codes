package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AList4sum {
        public static void main(String[]args) {
            Scanner sc=new Scanner(System.in);
            ArrayList<List<Integer>> result=new ArrayList<>();
            System.out.println("Enter the size:");
            int size=sc.nextInt();
            System.out.println("enter the target value:");
            int target=sc.nextInt();
            System.out.println("Enter the Array ");
            int[] nums = new int[size];
            int n=nums.length;
            for(int i=0;i<nums.length;i++){
                nums[i]=sc.nextInt();
            }
            for(int a=0;a<n-3;a++){
                for(int b=a+1;b<n-2;b++){
                    for(int c=b+1;c<n-1;c++){
                        for(int d=c+1;d<n;d++) {
                            if (nums[a] + nums[b] + nums[c] + nums[d] == target) {
                                List<Integer> temp = new ArrayList<>();
                                temp.add(nums[a]);
                                temp.add(nums[b]);
                                temp.add(nums[c]);
                                temp.add(nums[d]);
                                result.add(temp);
                            }
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
