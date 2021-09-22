package service.impl;

import comporator.RoomCapacityComparator;
import comporator.RoomPriceComparator;
import comporator.RoomStarsNumComparator;
import database.RoomDatabase;
import enums.RoomStatus;
import models.Client;
import models.Room;
import repository.RoomRepository;
import service.AbsService;
import service.RoomService;
import java.time.LocalDate;
import java.util.Arrays;

public class RoomServiceImpl extends AbsService implements RoomService {

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public boolean removeRoom(Room room) {
        return roomRepository.remove(room);
    }

    @Override
    public Room[] getAllRooms() {
        return trimToSize();
    }

    @Override
    public Room getRoomById(long id) {
        return roomRepository.getById(id);
    }

    @Override
    public boolean updateRoom(Room room) {
        return roomRepository.update(room);
    }

    @Override
    public Room[] getAllRoomsSortedByCapacity() {
        return (Room[]) sortByComparator(new RoomCapacityComparator());
    }

    @Override
    public Room[] getAllRoomsSortedByPrice() {
        return (Room[]) sortByComparator(new RoomPriceComparator());
    }

    @Override
    public Room[] getAllRoomsSortedByStarsNumber() {
        return ((Room[]) sortByComparator(new RoomStarsNumComparator()));
    }

    @Override
    public Room[] getFreeRoomsSortedByPrice() {
        return (Room[]) sortByComparator(new RoomPriceComparator());
    }

    @Override
    public Room[] getFreeRoomsSortedByCapacity() {
        final Room[] rooms = getFreeRooms();
        Arrays.sort(rooms, new RoomCapacityComparator());
        return rooms;
    }

    @Override
    public Room[] getFreeRoomsSortedByStarsNumber() {
        final Room[] rooms = getFreeRooms();
        Arrays.sort(rooms, new RoomCapacityComparator());
        return rooms;
    }

    @Override
    public int getFreeRoomsCount() {
        final Room[] copy = trimToSize();
        int count = 0;
        for (Room room : copy) {
            if (room.getStatus() == RoomStatus.FREE) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean changeStatus(long id, RoomStatus status) {
        final Room room = getRoomById(id);
        if (room == null) {
            return false;
        }
        room.setRoomStatus(status);
        return true;
    }

    @Override
    public boolean takeRoom(long id, Client client) {
        final Room room = getRoomById(id);
        if (room != null && room.getStatus() != RoomStatus.BUSY) {
            room.setRoomStatus(RoomStatus.BUSY);
            room.addClient(client);
            return true;
        }
        return false;
    }

    @Override
    public boolean vacateRoom(long id) {
        final Room room = getRoomById(id);
        if (room != null) {
            room.setRoomStatus(RoomStatus.FREE);
            room.removeClient();
        }
        return false;
    }

    @Override
    public boolean changePrice(long id, long price) {
        final Room room = getRoomById(id);
        if (room != null) {
            room.setPrice(price);
            return true;
        }
        return false;
    }

    @Override
    public Room[] getFreeRoomsForDate(LocalDate date) {
        final Room[] rooms = getAllRooms();
        int count = 0;
        for (Room room : rooms) {
            if (date.isAfter(room.getClients()[0].getEndDate())) {
                count++;
            }
        }
        final Room[] freeRooms = new Room[count];
        count = 0;
        for (Room room : rooms) {
            if (date.isAfter(room.getClients()[0].getEndDate())) {
                freeRooms[count++] = room;
            }
        }
        return freeRooms;
    }

    @Override
    protected Room[] trimToSize() {
        int capacity = 0;
        final Room[] rooms = RoomDatabase.getRooms();
        for (Room room : rooms) {
            if (room != null) {
                capacity++;
            }
        }
        Room[] tempArray = new Room[capacity];
        int index = 0;
        for (Room room : rooms) {
            if (room != null) {
                tempArray[index++] = room;
            }
        }
        return Arrays.copyOf(tempArray, tempArray.length);
    }

    private Room[] getFreeRooms() {
        final Room[] copy = trimToSize();
        final Room[] freeRoomsArray = new Room[getFreeRoomsCount()];
        int index = 0;
        for (Room room : copy) {
            if (room.getStatus() == RoomStatus.FREE) {
                freeRoomsArray[index++] = room;
            }
        }
        return freeRoomsArray;
    }

}

