import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i / Math.pow(2, i);
        }

        System.out.println("Sum: " + sum);
    }
}