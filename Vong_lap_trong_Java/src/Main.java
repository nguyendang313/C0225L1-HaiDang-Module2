import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Nhập số nguyên dương lớn hơn 0: ");
            number = scanner.nextInt();
        } while (number <= 0);

        String reversed = "";
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reversed += digit;
            number /= 10;
        }

        System.out.println("Số đảo ngược của " + original + " là: " + reversed);
    }
}
