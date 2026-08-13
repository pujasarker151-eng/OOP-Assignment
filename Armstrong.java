import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), temp = num, sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }

        if (num == sum) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}
