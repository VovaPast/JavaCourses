public class CreatureFirstPart implements LineStep {
    @Override
    public ProductPart buildProductPart() {
        System.out.println("Корпус прибыл");
        return new ProductBody("корпус");
    }
}