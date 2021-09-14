import java.util.Random;

public class NumberGenerator {

    public static int generate() {
        Random random = new Random();
        int x = random.nextInt(899) + 100;
        return x;
    }

    public static void findMaxNum(int x) {

        int a = x / 100;
        int b = (x / 10) % 10;
        int c = x % 10;

        System.out.println(x);
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}


