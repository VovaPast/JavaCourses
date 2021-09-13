import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List< product > Products = new ArrayList< product >();

        product AppleAfrica  = new Apple(700,35,"AppleAfrica");
        Products.add(AppleAfrica);
        product AppleUkraine = new Apple(1300,20,"AppleUkraine");
        Products.add(AppleUkraine);
        product AppleRussia = new Apple(500,20,"AppleRussia");
        Products.add(AppleRussia);
        product BeerGerman = new Beer(300,150,"BeerGerman");
        Products.add(BeerGerman);
        product BeerRussia = new Beer(700,50,"BeerRussia");
        Products.add(BeerRussia);
        product BeerPoland = new Beer(500,70,"BeerPoland");
        Products.add(BeerPoland);
        product Something1 = new Sidr(50,200,"Sidr1");
        Products.add(Something1);
        product Something2 = new Sidr(100,15,"Sidr2");
        Products.add(Something2);
        product Something3 = new Sidr(500,50,"Sidr3");
        Products.add(Something3);


        int maxsklad = 3000;
        int sklad = 0;

        System.out.print("Приоритетные товары : " );
        for (int i = 0; i < Products.size(); i++){
            sklad = sklad + Products.get(i).getAllWeight() ;
            if ( sklad > maxsklad){
                sklad = sklad - Products.get(i).getAllWeight();
            }else System.out.print(" "+Products.get(i).getName()+";");

        }

        System.out.println();
        System.out.println("Товар, общим весом " + sklad+" тонн, прибыл на склад.");


    }
}


