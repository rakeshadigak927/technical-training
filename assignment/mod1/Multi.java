import java.util.Scanner;
public class Multi {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to print table: ");
    int num = sc.nextInt();
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
        sc.close();
    }
}
