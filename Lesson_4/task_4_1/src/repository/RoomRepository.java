package repository;

import models.Room;

public interface RoomRepository {

    Room save(Room room);

    boolean remove(Room room);

    boolean update(Room room);

    Room getById(long id);

    Room[] getAll();

}

