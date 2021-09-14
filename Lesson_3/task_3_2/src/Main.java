import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> Products = new ArrayList<Product>();

        Product AppleAfrica = new Apple(700, 35, "AppleAfrica");
        Products.add(AppleAfrica);
        Product AppleUkraine = new Apple(1300, 20, "AppleUkraine");
        Products.add(AppleUkraine);
        Product AppleRussia = new Apple(500, 20, "AppleRussia");
        Products.add(AppleRussia);
        Product BeerGerman = new Beer(300, 150, "BeerGerman");
        Products.add(BeerGerman);
        Product BeerRussia = new Beer(700, 50, "BeerRussia");
        Products.add(BeerRussia);
        Product BeerPoland = new Beer(500, 70, "BeerPoland");
        Products.add(BeerPoland);
        Product Sidr1 = new Sidr(50, 200, "Sidr1");
        Products.add(Sidr1);
        Product Sidr2 = new Sidr(100, 15, "Sidr2");
        Products.add(Sidr2);
        Product Sidr3 = new Sidr(500, 50, "Sidr3");
        Products.add(Sidr3);

        int limitWarehouse = 3000;
        int warehouse = 0;

        System.out.print("Приоритетные товары : ");
        for (int i = 0; i < Products.size(); i++) {
            warehouse = warehouse + Products.get(i).getWeight();
            if (warehouse > limitWarehouse) {
                warehouse = warehouse - Products.get(i).getWeight();
            } else System.out.print(" " + Products.get(i).getName() + ";");
        }
        System.out.println();
        System.out.println("Товар, общим весом " + warehouse + " тонн, прибыл на склад.");
    }
}


