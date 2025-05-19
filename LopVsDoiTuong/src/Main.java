import javax.xml.namespace.QName;

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        System.out.println("Đối tượng kiểu Person đã được khỏi tạo");
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person minh = new Person("Nguyễn Nhật Minh", 25);
    }
}
