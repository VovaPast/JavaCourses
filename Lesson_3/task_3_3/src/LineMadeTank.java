class LineMadeTank implements AssemblyLine {

    public Product assembleProduct(Product iProduct) {

        ProductBody body = (ProductBody) new CreatureFirstPart().buildProductPart();

        iProduct.installFirstPart(body);

        ProductEngine engine = (ProductEngine) new CreatureSecondPart().buildProductPart();

        iProduct.installSecondPart(engine);

        ProductTower tower = (ProductTower) new CreatureThirdPart().buildProductPart();

        iProduct.installThirdPart(tower);

        InstalationProducts instalation = new InstalationProducts(body, engine, tower);

        System.out.println("Танк готов");

        return instalation;
    }
}
