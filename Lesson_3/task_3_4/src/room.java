import interfaces.*;

public class room extends hotel implements IChangeRoomStatus{
    private  boolean id;

    public room(int numRoom,float priceRoom,boolean id) {
        super(numRoom,priceRoom);
        this.id = id;
    }

    public boolean getId() {
        return id;
    }

    public int getNumRoom() {
        return numRoom;
    }

    public void setId(boolean id) {
        this.id = id;
    }
    @Override
    public void infchange() {
        if (id == false){  System.out.println("Номер "+ numRoom +" на ремонте "); }
        else{  System.out.println("Номер "+ numRoom +" готов к обслуживанию");  }
    }
    @Override
    public void change() {
        if (id == false) id = true;
    }

}
