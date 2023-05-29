package inheritance;

class Person {
    String name;
    String city;

    public void setPerson(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void getPerson() {
        System.out.println("NAME - " + this.name);
        System.out.println("CITY - " + this.city);
    }
}

class Student extends Person {
    int rollno;
    String branch;

    public void setStudent(int rollno, String branch) {
        this.rollno = rollno;
        this.branch = branch;
    }

    public void getStudent() {
        System.out.println("ROLL NO - " + this.rollno);
        System.out.println("BRANCH - " + this.branch);
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setPerson("Manoj","Solapur");
        s1.setStudent(38,"Computer Science");

        s1.getPerson();
        s1.getStudent();
    }
}
