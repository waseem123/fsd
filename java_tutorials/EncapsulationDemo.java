class Student {
    private int rollNo;
    private String name;
    private String city;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(101);
        s1.setName("John");
        s1.setCity("Solapur");

        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
        System.out.println(s1.getCity());
        System.out.println("__________________");
        Student s2 = new Student();
        s2.setRollNo(102);
        s2.setName("Alice");
        s2.setCity("Mumbai");

        System.out.println(s2.getRollNo());
        System.out.println(s2.getName());
        System.out.println(s2.getCity());
        System.out.println("__________________");
        s2.setCity("Bengaluru");
        System.out.println(s2.getRollNo());
        System.out.println(s2.getName());
        System.out.println(s2.getCity());


    }
}
