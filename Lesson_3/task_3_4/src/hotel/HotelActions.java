package hotel;

import room.Room;
import room.Status;
import service.Service;

public interface HotelActions {
    boolean putIntoHotelRoom(Room hotelRoom);
    boolean getFromHotelRoom(Room hotelRoom);
    boolean changeStatusHotelRoom(Room hotelRoom, Status status);
    long changeHotelRoomPrice(Room hotel, long newPrice);
    Room addHotelRoom(Room hotelRoom);
    long changeServicePrice(Service hotelService, long newPrice);
    Service addHotelService(Service hotelService);
}
