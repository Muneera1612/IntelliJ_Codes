package String;

public class NotoLetter {
    static void main() {
        int n=27;
        StringBuilder result=new StringBuilder();
        while(n>0){
            n--;
            char ch=(char)('A'+(n%26));
            result.append(ch);
            n=n/26;
        }
        System.out.println(result.reverse().toString());
    }
}
