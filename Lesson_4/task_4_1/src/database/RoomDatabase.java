package database;

import constants.Constants;
import enums.RoomStatus;
import models.Room;

public class RoomDatabase {

    private static Room[] rooms;

    private static void initRoomDatabase() {
        rooms = new Room[Constants.INITIAL_ARRAY_CAPACITY];

        Room room1 = new Room(10, RoomStatus.FREE, 110, 2, 3);
        Room room2 = new Room(18, RoomStatus.FREE, 200, 1, 4);
        Room room3 = new Room(19, RoomStatus.FREE, 105, 3, 2);
        Room room4 = new Room(20, RoomStatus.FREE, 100, 3, 1);
        Room room5 = new Room(21, RoomStatus.FREE, 150, 2, 2);
        Room room6 = new Room(22, RoomStatus.FREE, 215, 5, 2);

        room5.setId(IDGenerator.generateID());
        room1.setId(IDGenerator.generateID());
        room2.setId(IDGenerator.generateID());
        room3.setId(IDGenerator.generateID());
        room4.setId(IDGenerator.generateID());
        room5.setId(IDGenerator.generateID());

        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
        rooms[5] = room6;
    }

    public static Room[] getRooms() {
        if (rooms == null) {
            initRoomDatabase();
        }
        return rooms;
    }

    public static void setRooms(Room[] rooms) {
        RoomDatabase.rooms = rooms;
    }

}

