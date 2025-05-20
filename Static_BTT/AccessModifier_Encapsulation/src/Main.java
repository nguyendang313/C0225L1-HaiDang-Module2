public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Hai", 1000);
        BankAccount ba2 = new BankAccount("Dang", 2000);

        ba1.displayInfo();
        ba2.displayInfo();

        System.out.println("\nTrường hợp vượt quá số dư:");
        ba1.withdraw(10000);
        ba1.displayInfo();

        System.out.println("\nTrường hợp rút hợp lệ:");
        ba2.withdraw(100);
        ba2.displayInfo();

        System.out.println("\nSố dư còn lại:");
        System.out.println(ba1.getOwnerName() + ": " + ba1.getBalance() + "\n" + ba2.getOwnerName() + ": " + ba2.getBalance() + "\n");
    }
}
class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(ownerName + " nạp: " + amount + " thành công!");
        } else {
            System.out.println(ownerName + " vui lòng nạp số tiền lớn hơn 0!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println(ownerName + " vui lòng nhập số tiền phù hợp!");
        } else  {
            balance -= amount;
            System.out.println(ownerName + " rút tiền thành công!");
        }
    }

    public void displayInfo() {
        System.out.println("Chủ tài khoản: " + ownerName);
        System.out.println("Số dư hiện tại: " + balance);
    }
}