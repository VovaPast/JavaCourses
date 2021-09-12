public class CreatureThirdPart implements ILineStep{
    @Override
    public IProductPart buildProductPart() {

        System.out.println("Башня прибыла");
        return new ProductTower("башня") ;
    }
}
