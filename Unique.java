public class Unique {

    static void findTwoUniques(int[] arr) {

        int n1 = 0, n2 = 0;
        int xorAll = 0;

        // Step 1: XOR of all elements
        for (int i = 0; i < arr.length; i++) {
            xorAll ^= arr[i];
        }

        // Step 2: Get rightmost set bit
        int rsb = xorAll & -xorAll;

        // Step 3: Divide into two groups
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rsb) != 0) {
                n1 ^= arr[i];   // Group 1
            } else {
                n2 ^= arr[i];   // Group 2
            }
        }

        System.out.println("N1 = " + n1);
        System.out.println("N2 = " + n2);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1};
        findTwoUniques(arr);
    }
}