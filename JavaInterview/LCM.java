import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int lcm = (a > b) ? a : b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is " + lcm);
                break;
            }
            lcm++;
        }
    }
}
