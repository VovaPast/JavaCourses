import interfaces.IAddRoom;
import interfaces.IAddService;

public class maxQTY implements IAddService, IAddRoom{
    private  int QTYRoom;
    private  int QTYServices;

    public maxQTY(int QTYRoom,int QTYServices) {
        this.QTYRoom = QTYRoom;
        this.QTYServices = QTYServices;
    }

    public int getQTYRoom() {
        return QTYRoom;
    }

    public void setQTYRoom(int QTYRoom) {
        this.QTYRoom = QTYRoom;
    }

    public int getQTYServices() {
        return QTYServices;
    }

    public void setQTYServices(int QTYServices) {
        this.QTYServices = QTYServices;
    }

    @Override
    public int addroom() {
        return QTYRoom + 1;

    }

    @Override
    public int addService() {
        return QTYServices + 1;
    }
}
