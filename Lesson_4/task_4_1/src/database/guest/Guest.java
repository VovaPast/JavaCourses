package database.guest;

import database.room.Room;
import database.service.Service;
import enums.EliteStatus;
import enums.WorkStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Guest extends Room {
    private String name;
    private String startData;
    private String endData;

    public Guest(int id, String name, long price, String startData, String endData,
                 int beds, WorkStatus workStatus, EliteStatus  eliteStatus) throws ParseException {
        super( id, price, beds, workStatus, eliteStatus);
        this.name = name;
        this.startData = startData;
        this.endData = endData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartData() {
        return startData;
    }

    public void setStartData(String startData) {
        this.startData = startData;
    }

    public String getEndData() {
        return endData;
    }

    public void setEndData(String endData) {
        this.endData = endData;
    }


}
