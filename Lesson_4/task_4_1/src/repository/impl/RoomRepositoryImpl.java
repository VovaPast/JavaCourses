package repository.impl;

import database.RoomDatabase;
import models.Essence;
import models.Room;
import repository.Repository;
import repository.RoomRepository;

public class RoomRepositoryImpl extends Repository implements RoomRepository {

    @Override
    public Room save(Room room) {
        return (Room) saveEssence(room);
    }

    @Override
    public boolean remove(Room room) {
        return removeEssence(room);
    }

    @Override
    public boolean update(Room room) {
        return updateEssence(room);
    }

    @Override
    public Room[] getAll() {
        return getDatabaseArray();
    }

    @Override
    protected Room[] getDatabaseArray() {
        return RoomDatabase.getRooms();
    }

    @Override
    protected void setDatabaseArray(Essence[] essences) {
        RoomDatabase.setRooms((Room[]) essences);
    }

    @Override
    public Room getById(long i) {
        return (Room) getEssenceById(i);
    }

}

