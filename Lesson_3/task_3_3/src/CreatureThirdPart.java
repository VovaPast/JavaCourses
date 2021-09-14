public class CreatureThirdPart implements LineStep{
    @Override
    public ProductPart buildProductPart() {
        System.out.println("Башня прибыла");
        return new ProductTower("башня") ;
    }
}
