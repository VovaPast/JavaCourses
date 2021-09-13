public class CreatureFirstPart implements ILineStep{
    @Override
    public IProductPart buildProductPart() {

        System.out.println("Корпус прибыл");
        return new ProductBody("корпус");
    }
}