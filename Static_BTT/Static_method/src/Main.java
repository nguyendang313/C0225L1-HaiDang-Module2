public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Cộng: " + Calculator.add(a, b));
        System.out.println("Trừ: " + Calculator.subtract(a, b));
        System.out.println("Nhân: " + Calculator.multiply(a, b));

        try {
            System.out.println("Chia: " + Calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Chia: " + Calculator.divide(a, 0));
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0!");
        }
        return a / b;
    }
}