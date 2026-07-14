package problems;

import java.util.Scanner;

public class TicketbookingApp {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //movie booking details
        System.out.println("___Movie Ticket Booking Application___");
        System.out.println("1) Movie name:");
        System.out.println("2) Available Timing:");
        System.out.println("3) Class and price:");
        System.out.println("4) Enter the number of Tickets:");
        System.out.println("5) Total bill:");
        System.out.println("6) Exit");

        String movie="";
        String Timing="";
        String seat="";
        int price=0;
        int tickets=0;
        int total=0;
        //choice the options
        System.out.println("Enter the option:");
        int option=sc.nextInt();
        switch(option){
            case 1:
                System.out.println("---Movie names---");
                System.out.println("1) Leo ");
                System.out.println("2) Sarkar ");
                System.out.println("3) Bigil ");
                System.out.println("4) Mersal ");
                System.out.println("5) Jailer ");

                System.out.println("Choose movie:");
                int m=sc.nextInt();

                if(m==1){
                     movie="leo";
                }
                else if(m==2){
                    movie="Sarkar";
                }
                else if(m==3){
                    movie="Bigil";
                }
                else if(m==4){
                    movie="Mersal";
                }
                else if(m==5){
                    movie="Jailer";
                }
                else{
                    System.out.println("Invalid Movie name");
                }
            case 2:
                System.out.println("---Movie Timing---");
                System.out.println("1) 09.00AM ");
                System.out.println("2) 12.00PM ");
                System.out.println("3) 03.00PM ");
                System.out.println("4) 06.00PM ");
                System.out.println("5) 09.00PM ");

                System.out.println("Choose Timing:");
                int t=sc.nextInt();

                if(t==1){
                    Timing="09.00AM";
                } else if(t==2){
                    Timing="12.00PM";
                } else if(t==3){
                    Timing="03.00PM";
                } else if(t==4){
                    Timing="06.00PM";
                }else if(t==5){
                    Timing="09.00PM";
                }else {
                    System.out.println("Invalid Movie Timing:");
                }
            case 3:
                System.out.println("---Class and Price---");
                System.out.println("VIP Class = Rs.500 ");
                System.out.println("Gold Class = Rs.300 ");
                System.out.println("High Class = Rs.250 ");
                System.out.println("Middle Class = Rs.200 ");
                System.out.println("Low Class = Rs.150 ");

                System.out.println("Choose class and price: ");
                int p=sc.nextInt();

                if(p==1){
                    seat ="VIP class";
                    price=500;
                }else if(p==2){
                    seat="Gold Class";
                    price= 300;
                }else if(p==3){
                    seat ="High Class";
                    price=250;
                }else if(p==4){
                    seat ="Middle Class";
                    price=200;
                }else if(p==5){
                    seat ="Low Class";
                    price=150;
                }else{
                System.out.println("Invalid class and price");
                }
            case 4:
                System.out.println("Enter the Number of Tickets");
                tickets=sc.nextInt();

                total=tickets * price;

            case 5 :
                System.out.println("______BILL_____");
                System.out.println("Movie Name     : " + movie);
                System.out.println("Timing         : " + Timing);
                System.out.println("Class          : " + seat);
                System.out.println("Price per Seat : Rs." + price);
                System.out.println("Tickets        : " + tickets);
                System.out.println("Total Amount   : Rs." + total);
                System.out.println("================");

            case 6:
                System.out.println("---THANKYOU VISIT AGAIN---");

            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
