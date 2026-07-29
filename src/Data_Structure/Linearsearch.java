package Data_Structure;

public class Linearsearch {
    public static void main (String[] args){
        int [] arr={10,20,30,40,50};
        int key=20;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Key is founded "+i);
            }
        }
    }
}
