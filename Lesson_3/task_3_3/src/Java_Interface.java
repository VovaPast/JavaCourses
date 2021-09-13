interface IAssemblyLine{
    IProduct assembleProduct(IProduct iProduct);
}

interface ILineStep {
    IProductPart buildProductPart();
}

interface IProduct {
    void installFirstPart(IProductPart productPart);
    void installSecondPart(IProductPart productPart);
    void installThirdPart(IProductPart productPart);
}

interface IProductPart {
}
