import java.util.Scanner;
public class Factorial {
    static long findFactorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        return num * findFactorial(num - 1);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            long answer = findFactorial(number);
            System.out.println("Factorial of " + number + " is: " + answer);
        }
        sc.close();
    }
}
