public class Student {
//    String name;
//    int age;
//    double grade;
//
//    public Student(String name, int age, double grade) {
//        this.name = name;
//        this.age = age;
//        this.grade = grade;
//    }
//
//    public void displayInfor() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Grade: " + grade);
//    }
//
//    public static void main(String[] args) {
//        Student minh = new Student("Hoài Minh", 30, 0.5);
//
//        minh.displayInfor();
//    }


    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Tên: " + name + ", Điểm: " + grade);
    }

}

class Result {
    public static void main(String[] args) {
        Student[] students = {
                new Student("An", 9.0),
                new Student("Bình", 7.5),
                new Student("Cường", 6.0),
                new Student("Duy", 4.5),
                new Student("Em", 8.2),
                new Student("Phúc", 5.5),
                new Student("Giang", 3.8),
                new Student("Huy", 6.9),
                new Student("Khánh", 9.5),
                new Student("Linh", 7.0)
        };

        System.out.println("Danh sách học sinh có điểm > 8.0:");
        for (Student s : students) {
            if (s.grade > 8.0) {
                s.display();
            }
        }

        int yeu = 0, tb = 0, kha_gioi = 0;
        for (Student s : students) {
            if (s.grade < 5) {
                yeu++;
            } else if (s.grade <= 7) {
                tb++;
            } else {
                kha_gioi++;
            }
        }

        System.out.println("\nKết quả phân loại:");
        System.out.println("Yếu: " + yeu + " học sinh");
        System.out.println("Trung bình: " + tb + " học sinh");
        System.out.println("Khá/Giỏi: " + kha_gioi + " học sinh");
    }
}
