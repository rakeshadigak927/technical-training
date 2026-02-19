import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        String typeOfDay = switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "Working day";
            case "Saturday","Sunday" -> "Weekend";
            default -> "Error";
        };

        System.out.println("Type of Day: " + typeOfDay);
    }
}
