public class Student {
    int id;
    String name;
    String address;
    int age;
    double gpax;

    public Student() {

    }

    public void displayInformation() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("GPAX: " + gpax);
    }
}