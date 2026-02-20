public class BakerP {

    static int maxRegions(int n){
        return (n * (n + 1)) / 2 + 1;
    }

    static int maxPieces(int n){
        return (n * (n + 1)) / 2 + 1;
    }

    public static void main(String[] args){
        System.out.println(maxRegions(5)); // 16
        System.out.println(maxRegions(4)); // 11
    }
}