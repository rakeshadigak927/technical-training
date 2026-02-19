public class Triangle {
    public static void main(String[] args) {

        int rows = 3;

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= 9; c++) {

                if (c % 4 == 3 || c % 2 == 0 || c % 4 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
