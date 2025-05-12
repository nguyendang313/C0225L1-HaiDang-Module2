import java.util.Scanner;

public class TinhGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        do {
            System.out.print("Nhập số nguyên không âm N: ");
            N = scanner.nextInt();
        } while (N < 0);

        long factorial = 1;  // Dùng long để tránh tràn số cho N lớn

        for (int i = 2; i <= N; i++) {
            factorial *= i;
        }

        System.out.println("Giai thừa của " + N + " là: " + factorial);
    }
}
