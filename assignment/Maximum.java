import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = input.nextInt();
    System.out.print("Enter second number: ");
    int b = input.nextInt();
    System.out.print("Enter third number: ");
    int c = input.nextInt();
    int biggest;
    if (a >= b && a >= c) {
    biggest = a;
   } else if (b >= c) {
    biggest = b;
    } else {
     biggest = c;
        }
     System.out.println("Largest value is: " + biggest);
        input.close();
}
}
