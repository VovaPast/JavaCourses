import hotel.Hotel;
import room.Room;
import room.Status;
import service.Service;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(5, 3);

        Service Service1 = hotel.addHotelService(new Service(300, "уборка"));
        Service Service2 = hotel.addHotelService(new Service(500, "уборка люкс"));
        Service Service3 = hotel.addHotelService(new Service(0, "не убираться"));
        Service Service4 = hotel.addHotelService(new Service(10000, "убирается директор"));

        System.out.println();
        System.out.println(Arrays.toString(hotel.getHotelServices()));
        System.out.println(Service1);
        System.out.println();

        System.out.println("Услуга была изменена");
        Service1.changeProductPrice(325);
        System.out.println(Service1);
        System.out.println();

        Room Room1 = hotel.addHotelRoom(new Room(100, Status.FREE));
        Room Room2 = hotel.addHotelRoom(new Room(100, Status.FREE));
        Room Room3 = hotel.addHotelRoom(new Room(125, Status.REPAIRED));
        Room Room4 = hotel.addHotelRoom(new Room(100, Status.FREE));

        System.out.println(Arrays.toString(hotel.getHotelRooms()));
        System.out.println();
        hotel.getHotelRoomById(Room4.getId()).changeStatus(Status.REPAIRED);
        System.out.println("Статус комнаты был изменен");
        System.out.println(hotel.getHotelRoomById(Room4.getId()));

    }

}

