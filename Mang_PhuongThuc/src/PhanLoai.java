import java.util.Scanner;

public class PhanLoai {
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

        System.out.println("\nPhân loại học lực: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + " - Điểm: " + scores[i] + " - Học lực: ");
            if (scores[i] >= 8.0) {
                System.out.println("Giỏi");
            } else if (scores[i] >= 6.5) {
                System.out.println("Khá");
            } else if (scores[i] >= 5) {
                System.out.println("Trung bình");
            } else {
                System.out.println("Yếu");
            }
        }
    }
}
