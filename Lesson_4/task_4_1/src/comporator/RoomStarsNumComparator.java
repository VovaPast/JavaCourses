package comporator;

import models.Room;

import java.util.Comparator;

public class RoomStarsNumComparator implements Comparator<Room> {

    @Override
    public int compare(Room room, Room anotherRoom) {
        return room.getStarsNum() - anotherRoom.getStarsNum();
    }
}

