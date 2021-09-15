import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();

        Product Apple1 = new Apple(700, 35, "Apple1");
        products.add(Apple1);
        Product Apple2 = new Apple(1300, 20, "Apple2");
        products.add(Apple2);
        Product Apple3 = new Apple(500, 20, "Apple3");
        products.add(Apple3);
        Product Beer1 = new Beer(300, 150, "Beer1");
        products.add(Beer1);
        Product Beer2 = new Beer(700, 50, "Beer2");
        products.add(Beer2);
        Product Beer3 = new Beer(500, 70, "Beer3");
        products.add(Beer3);
        Product Sidr1 = new Sidr(50, 200, "Sidr1");
        products.add(Sidr1);
        Product Sidr2 = new Sidr(100, 15, "Sidr2");
        products.add(Sidr2);
        Product Sidr3 = new Sidr(500, 50, "Sidr3");
        products.add(Sidr3);

        int warehouse = 0;
        System.out.print("Товары поступившие на склад:");
        for (int i = 0; i < products.size(); i++) {
            warehouse = warehouse + products.get(i).getWeight();
            if (warehouse > 3000) { // допустим лимит склада 3000 тонн
                warehouse = warehouse - products.get(i).getWeight();
            } else System.out.print(" " + products.get(i).getName() + ";");
        }
        System.out.println();
        System.out.println("Товары, общим весом " + warehouse + " тонн, прибыл на склад.");
    }
}


