package Arrays;
import java.util.Scanner;
public class BuyandSell {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Enter the array: ");
        int []prices=new int[size];
        int minPrice=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else{
                int profit=prices[i]-minPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        System.out.println("Maximum: "+maxProfit);
    }
}
