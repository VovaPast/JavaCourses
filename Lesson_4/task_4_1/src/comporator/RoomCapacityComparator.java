package comporator;


import models.Room;
import java.util.Comparator;

public class RoomCapacityComparator implements Comparator<Room> {

    @Override
    public int compare(Room room, Room anotherRoom) {
            return room.getCapacity() - anotherRoom.getCapacity();
        }
    }

