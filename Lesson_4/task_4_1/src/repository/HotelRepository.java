package repository;

import database.guest.Guest;
import database.room.Room;
import database.service.Service;
import enums.WorkStatus;

public interface HotelRepository {
    boolean putIntoHotelRoom(Room hotelRoom);
    boolean getFromHotelRoom(Room hotelRoom);
    boolean changeStatusHotelRoom(Room hotelRoom, WorkStatus workStatus);
    long changeHotelRoomPrice(Room hotel, long newPrice);
    Room addHotelRoom(Room hotelRoom);
    long changeServicePrice(Service hotelService, long newPrice);
    Service addHotelService(Service hotelService);
    Guest addHotelGuest(Guest hotelGuest);
    Service[] getHotelServices();

    Room[] getHotelRooms();

    Room getHotelRoomById(int id);

    Service getHotelServiceById(int id);

}
