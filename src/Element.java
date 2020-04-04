import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        int [] [] array = { {1, 2, 3}, {4, 5, 6} };
        System.out.println("Nhập cột cần tính tổng");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() - 1;
        int sum = array[0][n] + array[1][n];
        System.out.println("Tổng là: " + sum);
    }
}
