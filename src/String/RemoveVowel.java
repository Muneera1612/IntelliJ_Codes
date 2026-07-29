package String;

public class RemoveVowel {
    public static void main(String[]args){
        StringBuilder sb= new StringBuilder("education");
        for(int i=0;i<sb.length();i++){
        char ch=sb.charAt(i);
            if(ch=='a'||ch=='e' ||ch=='i'||ch=='o'||ch=='u'||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'){
                sb.deleteCharAt(i);
                i--;
                //sb.setCharAt(i);

            }
        }
     System.out.println(sb);
        /*String str="JAVA";
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'||ch=='O'||ch=='U')
            {                                          //if(str.charAt(i)='a'||..str.chatAt(i)='u')
                str = str.replace(ch, '*');           //sb.append(*);
                                                      //sb.append(str.charAt(i));
            }
        }
        System.out.println(str);*/
    }
}
