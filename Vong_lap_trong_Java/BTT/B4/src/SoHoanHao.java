import java.util.Scanner;

public class SoHoanHao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Nhập một số nguyên dương: ");
            number = scanner.nextInt();
        } while (number <= 0);

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " là số hoàn hảo.");
        } else {
            System.out.println(number + " không phải là số hoàn hảo.");
        }
    }
}
