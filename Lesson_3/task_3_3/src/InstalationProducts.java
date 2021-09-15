public class InstalationProducts implements ProductPart{

    ProductPart body;
    ProductPart tower;
    ProductPart engine;

    InstalationProducts(ProductBody body, ProductEngine engine, ProductTower tower){
        this.body = body;
        this.engine = engine;
        this.tower = tower;
    }

    @Override
    public void installFirstPart(ProductPart productPart) {

        System.out.println("Корпус готов к установке деталей");
        System.out.println();
    }

    @Override
    public void installSecondPart(ProductPart productPart) {

        System.out.println("Двигатель установлен");
        System.out.println();
    }

    @Override
    public void installThirdPart(ProductPart productPart) {

        System.out.println("Башня установлена");
        System.out.println();
    }

    InstalationProducts(){}
}
