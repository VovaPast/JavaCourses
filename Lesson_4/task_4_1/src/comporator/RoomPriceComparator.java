package comporator;


import models.Room;

import java.util.Comparator;

public class RoomPriceComparator implements Comparator<Room> {

    @Override
    public int compare(Room room, Room anotherRoom) {

        return new Long(room.getPrice()).compareTo(anotherRoom.getPrice());
    }
}

