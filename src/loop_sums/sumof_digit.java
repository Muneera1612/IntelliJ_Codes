package loop_sums;

public class sumof_digit {
    public static void main(String[]args){
        int num=1745;
        int sum=0;
        while(num>0){
            int reminder =num%10;
            num=num/10;
            sum=sum+reminder;
        }
        System.out.println(sum);
    }
}
