import hotel.Hotel;
import room.Room;
import room.Status;
import service.Service;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(5, 3);

        Service service1 = hotel.addHotelService(new Service(300, "уборка"));
        Service service2 = hotel.addHotelService(new Service(500, "уборка люкс"));
        Service service3 = hotel.addHotelService(new Service(0, "не убираться"));
        Service service4 = hotel.addHotelService(new Service(10000, "убирается директор"));

        System.out.println();
        System.out.println(Arrays.toString(hotel.getHotelServices()));
        System.out.println(service1);
        System.out.println();

        System.out.println("Услуга была изменена");
        service1.changeProductPrice(325);
        System.out.println(service1);
        System.out.println();

        Room room1 = hotel.addHotelRoom(new Room(100, Status.FREE));
        Room room2 = hotel.addHotelRoom(new Room(100, Status.FREE));
        Room room3 = hotel.addHotelRoom(new Room(125, Status.REPAIRED));
        Room room4 = hotel.addHotelRoom(new Room(100, Status.FREE));

        System.out.println(Arrays.toString(hotel.getHotelRooms()));
        System.out.println();
        hotel.getHotelRoomById(room4.getId()).changeStatus(Status.REPAIRED);
        System.out.println("Статус комнаты был изменен");
        System.out.println(hotel.getHotelRoomById(room4.getId()));

    }

}

