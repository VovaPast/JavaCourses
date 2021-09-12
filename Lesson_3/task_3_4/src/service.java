import interfaces.IAddService;
import interfaces.IChangePriceRoomOrService;

public class service extends hotel implements IChangePriceRoomOrService {
    private  int numService;
    private  double priceService;

    public service(int numRoom, double priceRoom,int numService,double priceService) {
        super(numRoom,priceRoom);
        this.numService = numService;
        this.priceService = priceService;
    }

    public int getNumService() {
        return numService;
    }

    public void setNumService(int numService) {
        this.numService = numService;
    }

    public double getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    @Override
    public void changePriceRoom() {
        double q = getPriceRoom() + getPriceRoom()/5;
        System.out.println("Из-за налогов были подняты цены на комнаты, новая цена на комнату: " + q);
    }

    @Override
    public void changePriceService() {
        double q = getPriceService() + getPriceService()/8;
        System.out.println("Из-за налогов были подняты цены на услуги, новая цена услуги: " + q);
    }

}
