package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
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
}
