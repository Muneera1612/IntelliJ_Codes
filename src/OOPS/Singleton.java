package OOPS;

public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("Object oriented");
    }
    public static Singleton getInstance(){
        //check whether 1 obj is created or not
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    static void main() {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
    }

}
