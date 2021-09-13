package basis;

public abstract class Basis implements ActionsWithBasis {

    private long price;
    private int id;

    public Basis(long price) {
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public long changeProductPrice(long newPrice) {
        setPrice(newPrice);
        return newPrice;
    }

    protected abstract String getSubclassToString();

    @Override
    public String toString() {
        int num = id + 1;
        return "||" + getClass().getSimpleName() + " # " + num + ", цена: " + price + getSubclassToString() + "||";
    }
}

