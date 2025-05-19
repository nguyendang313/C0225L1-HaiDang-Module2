import java.util.Scanner;

public class TimDiem {
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

        System.out.println("\nNhập điểm cần tìm: ");
        double target = scanner.nextDouble();

        boolean found = false;
        System.out.println("\nVị trí xuất hiện của điểm " + target + " là:");
        for (int i = 0; i < n; i++) {
            if (scores[i] != target) {
                continue;
            }
            System.out.println("chỉ số: " + i);
            found = true;
        }

        if (!found) {
            System.out.println("Không tìm thấy điểm " + target + " trong danh sách");
        }
    }
}
