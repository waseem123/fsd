package inheritance;

class Bag {
    private String company;
    private int capacity;

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}

class SchoolBag extends Bag {
    private int no_of_sections;
    private String usage;
    private int price;

    public int getNo_of_sections() {
        return no_of_sections;
    }

    public void setNo_of_sections(int no_of_sections) {
        this.no_of_sections = no_of_sections;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class OfficeBag extends Bag {
    private int no_of_sections;
    private String usage;
    private int price;

    public int getNo_of_sections() {
        return no_of_sections;
    }

    public void setNo_of_sections(int no_of_sections) {
        this.no_of_sections = no_of_sections;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        SchoolBag sc = new SchoolBag();
        sc.setCompany("American Tourister");
        sc.setCapacity(30);
        sc.setNo_of_sections(5);
        sc.setPrice(1500);
        sc.setUsage("Carrying for school and college that contains books and laptops and waterbottle");

        OfficeBag ofc = new OfficeBag();
        ofc.setCompany("Skybags");
        ofc.setCapacity(15);
        ofc.setNo_of_sections(3);
        ofc.setPrice(2500);
        ofc.setUsage("Carrying for office and meetings that contains documents and laptops");

        System.out.println("SCHOOL BAGS");
        System.out.println("COMPANY  - " + sc.getCompany());
        System.out.println("CAPACITY - " + sc.getCapacity());
        System.out.println("SECTIONS - " + sc.getNo_of_sections());
        System.out.println("USAGE    - " + sc.getUsage());
        System.out.println("PRICE    - " + sc.getPrice());
        System.out.println("______________________________");
        System.out.println("OFFICE BAGS");
        System.out.println("COMPANY  - " + ofc.getCompany());
        System.out.println("CAPACITY - " + ofc.getCapacity());
        System.out.println("SECTIONS - " + ofc.getNo_of_sections());
        System.out.println("USAGE    - " + ofc.getUsage());
        System.out.println("PRICE    - " + ofc.getPrice());


    }
}
