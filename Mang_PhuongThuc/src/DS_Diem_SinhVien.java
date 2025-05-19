import java.util.Scanner;

public class DS_Diem_SinhVien {
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

        System.out.println("\nDanh sách điểm đã nhập: ");
        for (int i = 0; i < n; i++){
            System.out.println("Sinh viên " + (i + 1) + " có điểm là: " + scores[i]);
        }

        double sum = 0;
        int countPassed = 0;
        double max = scores[0];
        double min = scores[0];

        for (int i = 0; i < n; i++) {
            sum += scores[i];
            if (scores[i] >= 5) {
                countPassed++;
            }
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        double avg = sum / n;

        System.out.println("\n");
        System.out.println("Điểm trung bình là: " + avg);
        System.out.println("Số sinh viên đạt (>= 5): " + countPassed);
        System.out.println("Điểm cao nhất: " + max);
        System.out.println("Điểm thấp nhât: " + min);
    }
}
