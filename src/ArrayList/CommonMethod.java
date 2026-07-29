package ArrayList;
import java.util.ArrayList;
public class CommonMethod {
    public static void main(String[] args){
        ArrayList<String> cars=new ArrayList<>();
        //add method
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyoto");
        System.out.println(cars);
        //add an elemnt
        cars.add(0,"Audi");
        System.out.println(cars);
        //get method
        System.out.println(cars.get(0));
        //set method
        cars.set(0,"Opel");



    }
}
