import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), temp = num, sum = 0;

        while (temp > 0) {
            int rem = temp % 10, fact = 1;
            for (int i = 1; i <= rem; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }

        if (num == sum) System.out.println("Strong Number");
        else System.out.println("Not Strong Number");
    }
}