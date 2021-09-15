public class ThirdPart implements LineStep{
    @Override
    public ProductPart buildProductPart() {
        System.out.println("Башня прибыла");
        return new ProductTower("башня") ;
    }
}
