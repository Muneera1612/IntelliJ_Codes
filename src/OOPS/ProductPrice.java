package OOPS;

public class ProductPrice {
    public static void main(String[]args){
        price p=new price();
        p.setPrice(599.65);
        System.out.println(p.getPrice());

    }
}
class price {
    private double price;
    public void setPrice(double price) {
        if (price>0){
            this.price=price;
        }
    }

    public double getPrice() {
        return price;
    }
}