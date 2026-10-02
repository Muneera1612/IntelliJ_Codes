package Arrays;
import java.util.*;
public class CurrentDate_TIme {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long millis=System.currentTimeMillis();
        long totalsec=millis / 1000;
        long sec=totalsec % 60;
        long totalmin=totalsec / 60;
        long min=totalmin %60;
        long totalhrs=totalmin/60;
        long hrs=totalhrs%60;
        long totalDays=totalhrs/24;
        int year=2020;
        int month=8;
        int day=13;
        int []daysinmonth={31,28,31,30,31,30,31,31,30,31,30,31};
        while(true){
            int daysinyear=365;
            if((year%400 ==0)|| (year%4==0 && year%100!=0)){
                daysinyear=366;
            }
            if(totalDays>=daysinyear){
                totalDays-=daysinyear;
                year++;
            }
            else {
                break;
            }
        }
        if((year%400==0)||(year%4==0 && year%4!=0)){
            daysinmonth[1]=29;
        }
        int i=0;
        while(totalDays>=daysinmonth[i]){
            totalDays-=daysinmonth[i];
            i++;
        }
        month=i+1;
        day=(int)totalDays+1;
        System.out.println("Date: "+day+"-"+month+":"+year);
        System.out.println("Time: "+hrs+":"+min+":"+sec);

    }
}
