public class Even {
    public static void main(String[] args) {
    int start = 1;
    int total = 0;
        while (start <= 100) {
        if (start % 2 == 0) {
                total += start;
            }
          start++;
        }
        System.out.println("Sum of even numbers between 1 and 100: " + total);
    }
}
