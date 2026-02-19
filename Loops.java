package Loops;

public class Loops {
    static int practice1(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;

    }

    public static void main(String[] args) {

        System.out.println(practice1(11));
        System.out.println(practice1(1));
        System.out.println(practice1(21));


    }
}