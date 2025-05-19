public class Main {
    public static void main(String[] args) {
        int[] my_numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < my_numbers.length; i++) {
            if (my_numbers[i] % 2 != 0) {
                System.out.println("Phần tử chứa số lẻ tại vị trí " + i + " là " +my_numbers[i]);
            }
        }
    }
}
