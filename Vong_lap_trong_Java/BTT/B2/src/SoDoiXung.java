import java.util.Scanner;

public class SoDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Nhập số nguyên dương lớn hơn 0: ");
            number = scanner.nextInt();
        } while (number <= 0);

        int reversed = 0;
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " là số đối xứng");
        } else {
            System.out.println(original + " không phải là số đối xứng");
        }

        System.out.println("Số đảo ngược của " + original + " là: " + reversed);
    }
}
