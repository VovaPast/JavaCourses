package service;

import enums.RoomStatus;
import models.Client;
import models.Room;

import java.time.LocalDate;

public interface RoomService {

    Room saveRoom(Room room);

    boolean removeRoom(Room room);

    Room[] getAllRooms();

    Room getRoomById(long id);

    boolean updateRoom(Room room);

    Room[] getAllRoomsSortedByCapacity();

    Room[] getAllRoomsSortedByPrice();

    Room[] getAllRoomsSortedByStarsNumber();

    Room[] getFreeRoomsSortedByPrice();

    Room[] getFreeRoomsSortedByCapacity();

    Room[] getFreeRoomsSortedByStarsNumber();

    int getFreeRoomsCount();

    boolean changeStatus(long id, RoomStatus status);

    boolean takeRoom(long id, Client client);

    boolean vacateRoom(long id);

    boolean changePrice(long id, long price);

    Room[] getFreeRoomsForDate(LocalDate date);

}
