import java.util.Scanner;

public class TinhTienDIen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double consume, total;
        System.out.print("Your consume (in kWh): ");
        consume = scanner.nextDouble();

        //System.out.printf("%-20s%s", "total", "Interpretation\n");
        System.out.println("\n");

        if (consume > 0 && consume <= 50)
            total = consume * 1800;
        else if (consume <= 100)
            total = (50 * 1800) + ((consume - 50) * 2300);
        else
            total = (50 * 1800) + (50 * 2300) + ((consume - 100) * 3000);

        System.out.println("Số tiền cần trả: " + total + "VNĐ");
    }
}
