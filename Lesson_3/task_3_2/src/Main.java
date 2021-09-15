import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();

        Product apple1 = new Apple(700, 35, "Apple1");
        products.add(apple1);
        Product apple2 = new Apple(1300, 20, "Apple2");
        products.add(apple2);
        Product apple3 = new Apple(500, 20, "Apple3");
        products.add(apple3);
        Product beer1 = new Beer(300, 150, "Beer1");
        products.add(beer1);
        Product beer2 = new Beer(700, 50, "Beer2");
        products.add(beer2);
        Product beer3 = new Beer(500, 70, "Beer3");
        products.add(beer3);
        Product sidr1 = new Sidr(50, 200, "Sidr1");
        products.add(sidr1);
        Product sidr2 = new Sidr(100, 15, "Sidr2");
        products.add(sidr2);
        Product sidr3 = new Sidr(500, 50, "Sidr3");
        products.add(sidr3);

        int warehouseCapacity = 0;
        System.out.print("Товары поступившие на склад:");
        for (int i = 0; i < products.size(); i++) {
            warehouseCapacity = warehouseCapacity + products.get(i).getWeight();
            if (warehouseCapacity > 3000) {                                       // допустим лимит склада 3000 тонн
                warehouseCapacity = warehouseCapacity - products.get(i).getWeight();
            } else System.out.print(" " + products.get(i).getName() + ";");
        }
        System.out.println();
        System.out.println("Товары, общим весом " + warehouseCapacity + " тонн, прибыли на склад.");
    }
}


