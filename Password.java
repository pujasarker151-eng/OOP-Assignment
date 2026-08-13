import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass;

        do {
            System.out.print("Enter password: ");
            pass = sc.nextInt();
        } while (pass != 1234);

        System.out.println("Correct Password!");
    }
}