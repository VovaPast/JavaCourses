import java.util.Random;

public class main {

    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(899) + 100;

        int a = x / 100;
        int b = ( x / 10 ) % 10;
        int c = x % 10;

        if (a > b && a > c) {
            System.out.println (a);
        } else if (b > a && b > c) {
            System.out.println (b);
        } else {
            System.out.println (c);
        }

        System.out.println (x);
        }
}
