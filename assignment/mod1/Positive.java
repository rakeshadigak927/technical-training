import java.util.Scanner;
public class Positive  {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any integer: ");
    int value = sc.nextInt();
        if (value > 0) {
            System.out.println("The number is Positive");
        } else if (value < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
        sc.close();
    }
}
