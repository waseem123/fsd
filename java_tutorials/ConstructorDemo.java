class Watch {
    private String brand;
    private String type;
    private int price;

    /*public Watch() {
        brand = "BoAt";
        type = "Smart Watch";
        price = 6000;
    }*/

    public Watch(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public Watch(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Watch(Watch w){
        this.brand = w.brand;
        this.type = w.type;
        this.price = w.price;
    }

    public void displayWatch() {
        System.out.println("BRAND - " + brand);
        System.out.println("TYPE  - " + type);
        System.out.println("PRICE - " + price);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Watch w1 = new Watch("Analog","Fastrack",8000);
        w1.displayWatch();

        System.out.println("_______________");

        Watch w2 = new Watch("BoAt","Smartwatch",6000);
        w2.displayWatch();
        System.out.println("_______________");

        Watch w3 = new Watch("Titan",10000);
        w3.displayWatch();
        System.out.println("_______________");

        Watch w4 = w2;
        w4.displayWatch();

        System.out.println("_______________");

        Watch w5 = new Watch(w2);
        w5.displayWatch();
    }
}
