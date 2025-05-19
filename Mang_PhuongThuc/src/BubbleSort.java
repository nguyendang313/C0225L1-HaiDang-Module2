import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Nhập số lượng sinh viên (tối đa 100 sinh viên): ");
            n = scanner.nextInt();
        } while (n <= 0 || n > 100);

        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            double score;
            do {
                System.out.println("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
                score = scanner.nextDouble();
            } while (score < 0 || score > 10);

            scores[i] = score;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    double temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }

        System.out.println("\nDanh sách điểm sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": " + scores[i]);
        }
    }
}
