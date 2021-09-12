

public  class hotel   {
    private  int QTYRoom;
    private  int QTYServices;
    public   int numRoom;
    private  double priceRoom;


    private hotel(int QTYRoom,int QTYServices) {
        this.QTYRoom = QTYRoom;
        this.QTYServices = QTYServices;
    }

    public hotel(int numRoom, double priceRoom) {
        this.numRoom = numRoom;
        this.priceRoom = priceRoom;
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

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(float priceRoom) {
        this.priceRoom = priceRoom;
    }

    public int getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

}
