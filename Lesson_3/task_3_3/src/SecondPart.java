public class SecondPart implements LineStep {
    @Override
    public ProductPart buildProductPart() {
        System.out.println("Двигатель прибыл");
        return new ProductEngine("двигатель");
    }
}

