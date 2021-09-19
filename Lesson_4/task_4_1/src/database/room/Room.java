package database.room;

import enums.EliteStatus;
import enums.WorkStatus;
import repository.RoomRepository;

import static enums.WorkStatus.*;

public class Room implements RoomRepository {

    private WorkStatus workStatus;
    private EliteStatus eliteStatus;
    private long price;
    private int id;
    private int beds;

    public Room(int id, long price, int beds, WorkStatus workStatus, EliteStatus  eliteStatus) {
        this.id = id;
        this.price = price;
        this.beds = beds;
        this.workStatus = workStatus;
        this.eliteStatus = eliteStatus;
    }

    public void setWorkStatus(WorkStatus workStatus) {
        this.workStatus = workStatus;
    }

    public WorkStatus getWorkStatus() {
        return workStatus;
    }

    public void setEliteStatus(EliteStatus eliteStatus) {
        this.eliteStatus = eliteStatus;
    }

    public EliteStatus getEliteStatus() {
        return eliteStatus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean putIntoRoom() {
        if (WorkStatus == FREE) {
            setWorkStatus(BUSY);
            return true;
        }
        return false;
    }

    @Override
    public boolean getFromRoom() {
        if (WorkStatus == BUSY) {
            setWorkStatus(FREE);
            return true;
        }
        return false;
    }

    @Override
    public boolean changeWorkStatus(WorkStatus newWorkStatus) {
        if (newWorkStatus == REPAIRED || newWorkStatus == SERVED) {
            setWorkStatus(newWorkStatus);
            return true;
        }
        return false;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
