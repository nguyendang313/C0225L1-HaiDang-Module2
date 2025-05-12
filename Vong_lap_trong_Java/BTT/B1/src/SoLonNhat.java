import java.util.Scanner;

public class SoLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Nhập số nguyên dương lớn hơn 0: ");
            number = scanner.nextInt();
        } while (number <= 0);

        int maxDigit = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }

        System.out.println("Số lớn nhất là: " + maxDigit);
    }
}
