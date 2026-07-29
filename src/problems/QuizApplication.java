package problems;

import java.util.Scanner;

public class QuizApplication {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username:");
        String username=sc.nextLine();
        System.out.println("Enter the Password");
        String pass=sc.nextLine();
        if(username=="muneeraparveen" && pass=="muneera1612"){
            System.out.println("Login Successful");
            System.out.println("-----QUIZ START NOW-----");
        }
        /*else{
            System.out.println("Exist");
        }*/
        int count=0;
        System.out.println("___QUIZ APPLICATION___");
        System.out.println("1) Java Basics");
        System.out.println("2) Logical Questions");
        System.out.println("3) Exit");
        //enter the choice
        System.out.println("Enter the choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Java basics");
                //Q1
                System.out.println("1) Java is which level language?");
                System.out.println("a) high level");
                System.out.println("b) low level");
                System.out.println("c) medium level");
                System.out.println("d) bottom level");
                char ch=sc.next().charAt(0);
                if(ch=='a' || ch=='A'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }
                //Q2
                System.out.println("2) Which keyword is used to create a class?");
                System.out.println("a) new");
                System.out.println("b) object");
                System.out.println("c) class");
                System.out.println("d) create");
                char a=sc.next().charAt(0);
                if(a=='c' || a=='C'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }
                //Q3
                System.out.println("3) Which symbol is used to end a statement in Java?");
                System.out.println("a) :");
                System.out.println("b) ;");
                System.out.println("c) .");
                System.out.println("c) ,");
                char b=sc.next().charAt(0);
                if(b=='b' || b=='B'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }
                //Q4
                System.out.println("4) Which of the following is a primitive data type?");
                System.out.println("a) String");
                System.out.println("b) Array");
                System.out.println("c) Class");
                System.out.println("d) int");
                char c=sc.next().charAt(0);
                if(c=='d' || c=='D'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }
                //Q5
                System.out.println("5) What is the size of int data type in Java?");
                System.out.println("a) 8 bits");
                System.out.println("b) 16 bits");
                System.out.println("c) 32 bits");
                System.out.println("d) 64 bits");
                char d=sc.next().charAt(0);
                if(d=='c' || d=='C'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }
                //Q6
                System.out.println("6) Why is Java platform independent?");
                System.out.println("a) Because it uses pointers");
                System.out.println("b) Because it is interpreted");
                System.out.println("c) Because Java code runs on JVM");
                System.out.println("d) Because  it is compiled to machine code");
                char e=sc.next().charAt(0);
                if(e=='c' || e=='C'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }
                //Q7
                System.out.println("7) Which method is used t start execution of a Java program?");
                System.out.println("a) start()");
                System.out.println("b) main()");
                System.out.println("c) run()");
                System.out.println("d) executed");
                char m=sc.next().charAt(0);
                if(m=='b' || m=='B'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }
                //Q8
                System.out.println("8) What is inheritance in Java?");
                System.out.println("a) using many methods");
                System.out.println("b) one class acquiring properties of another class");
                System.out.println("c) writing code again");
                System.out.println("d) creating objects");
                char f=sc.next().charAt(0);
                if(f=='b' || f=='B'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }
                //Q9
                System.out.println("9) Which keyword is used to print output?");
                System.out.println("a) print");
                System.out.println("b) write");
                System.out.println("c) echo");
                System.out.println("d) System.out.println");
                char g=sc.next().charAt(0);
                if(g=='d' || g=='D'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }
                //Q10
                System.out.println("10) Which keyword is used to take a decision?");
                System.out.println("a) loop");
                System.out.println("b) if");
                System.out.println("c) break");
                System.out.println("d) continue");
                char h=sc.next().charAt(0);
                if(h=='b' || h=='B'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }
                System.out.println("Total score"+"="+count+"/10");
                if(count==10){
                    System.out.println("Excellent");
                }else if(count<10 && count>=5){
                    System.out.println("Good");
                }else if(count<5){
                    System.out.println("Bad");
                }else{
                    System.out.println("Fail");
                }
                break;

            /*case 2:
                System.out.println("___Logical questions___");
                System.out.println("1) Java is which level language");
                System.out.println("a) high level");
                System.out.println("b) ");
                System.out.println("c) ");
                System.out.println("c) ");
                char ch=sc.next().charAt(0);
                if(ch=='a' || ch=='A'){
                    count+=1;
                    System.out.println("Correct Answer");
                }
                else{
                    System.out.println("Wrong Answer");
                }*/
            case 3:
                System.out.println("____Exit____");
                System.out.println("_____________THANKYOU______________");
            default:
                System.out.println("Invalid");
        }

    }

}
