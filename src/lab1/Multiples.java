package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(){
        int n = 0;
        int i = 1;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                n++;
            }
            i++;
        }
        return n;
    }
    public static int multiples(int n, int a, int b) {
        int count = 0;
        int i = 1;
        while (i < n) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}
