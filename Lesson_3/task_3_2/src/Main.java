import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> Products = new ArrayList<Product>();

        Product Apple1 = new Apple(700, 35, "Apple1");
        Products.add(Apple1);
        Product Apple2 = new Apple(1300, 20, "Apple2");
        Products.add(Apple2);
        Product Apple3 = new Apple(500, 20, "Apple3");
        Products.add(Apple3);
        Product Beer1 = new Beer(300, 150, "Beer1");
        Products.add(Beer1);
        Product Beer2 = new Beer(700, 50, "Beer2");
        Products.add(Beer2);
        Product Beer3 = new Beer(500, 70, "Beer3");
        Products.add(Beer3);
        Product Sidr1 = new Sidr(50, 200, "Sidr1");
        Products.add(Sidr1);
        Product Sidr2 = new Sidr(100, 15, "Sidr2");
        Products.add(Sidr2);
        Product Sidr3 = new Sidr(500, 50, "Sidr3");
        Products.add(Sidr3);

        int warehouse = 0;
        System.out.print("Товары поступившие на склад:");
        for (int i = 0; i < Products.size(); i++) {
            warehouse = warehouse + Products.get(i).getWeight();
            if (warehouse > 3000) { // допустим лимит склада 3000 тонн
                warehouse = warehouse - Products.get(i).getWeight();
            } else System.out.print(" " + Products.get(i).getName() + ";");
        }
        System.out.println();
        System.out.println("Товары, общим весом " + warehouse + " тонн, прибыл на склад.");
    }
}


