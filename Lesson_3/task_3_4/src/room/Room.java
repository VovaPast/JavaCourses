package room;

import product.Product;
import static room.Status.*;

public class Room extends Product implements AdditionalRoomActions {

    private Status status;

    public Room(long price, Status status) {
        super(price);
        this.status = status;
    }

    private void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean putIntoRoom() {
        if (status == FREE) {
            setStatus(Status.BUSY);
            return true;
        }
        return false;
    }

    @Override
    public boolean getFromRoom() {
        if (status == BUSY) {
            setStatus(FREE);
            return true;
        }
        return false;
    }

    @Override
    public boolean changeStatus(Status newStatus) {
        if (newStatus == REPAIRED || newStatus == SERVED) {
            setStatus(newStatus);
            return true;
        }
        return false;
    }

    @Override
    protected String getSubclassToString() {
        return " Статус номера: " + status;
    }
}
