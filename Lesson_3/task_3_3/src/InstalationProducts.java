public class InstalationProducts implements IProduct{

    IProductPart body;
    IProductPart tower;
    IProductPart engine;

    InstalationProducts(ProductBody body, ProductEngine engine, ProductTower tower){
        this.body = body;
        this.engine = engine;
        this.tower = tower;
    }

    @Override
    public void installFirstPart(IProductPart productPart) {

        System.out.println("Корпус готов к установке деталей");
        System.out.println();
    }

    @Override
    public void installSecondPart(IProductPart productPart) {

        System.out.println("Двигатель установлен");
        System.out.println();
    }

    @Override
    public void installThirdPart(IProductPart productPart) {

        System.out.println("Башня установлена");
        System.out.println();
    }

    InstalationProducts(){}
}
