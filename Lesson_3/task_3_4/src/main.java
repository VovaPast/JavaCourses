import interfaces.IAddRoom;

public class main {
    public static void main(String[] args) {

        client Alex = new client("Alex","Ake", 4,50);
        Alex.putInRoom();
        Alex.removeFromRoom();

        room room4 = new room(4,50,false);
        room4.infchange();
        room4.change();
        room4.infchange();

        service packet1 = new service(5,50,3,20);
        packet1.changePriceRoom();
        packet1.changePriceService();

        maxQTY Now = new maxQTY(20,5);

        int n = Now.addroom();
        System.out.println("Кол-во комнат в отеле было увеличенно , теперь их : "+ n);
        n = Now.addService();
        System.out.println("Кол-во услуг в отеле было увеличенно , теперь их : "+ n);




    }

}
