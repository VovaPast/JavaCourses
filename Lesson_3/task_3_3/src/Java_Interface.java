interface AssemblyLine{
    Product assembleProduct(Product iProduct);
}

interface LineStep {
    ProductPart buildProductPart();
}

interface Product {
    void installFirstPart(ProductPart productPart);
    void installSecondPart(ProductPart productPart);
    void installThirdPart(ProductPart productPart);
}

interface ProductPart {
}
