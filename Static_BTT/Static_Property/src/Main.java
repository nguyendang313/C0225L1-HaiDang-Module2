public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("A");
        Student s2 = new Student("B");
        Student s3 = new Student("C");

        s1.display();
        s2.display();
        s3.display();
    }
}
class Student {
    private String name;
    private int id;
    private static int nextID = 1000;

    public Student(String name) {
        this.name = name;
        this.id = nextID++;
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}
