public class CreatureSecondPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {

        System.out.println("Двигатель прибыл");
        return new ProductEngine("двигатель");
    }
}

