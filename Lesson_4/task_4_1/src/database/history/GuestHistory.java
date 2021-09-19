package database.history;

import database.guest.Guest;
import database.hotel.Hotel;
import database.room.Room;
import database.service.Service;
import enums.EliteStatus;
import enums.WorkStatus;

import java.text.ParseException;

public class GuestHistory {


        Hotel hotel = new Hotel(5, 3,3);

        Guest guest1 = hotel.addHotelGuest(new Guest(1,"alex", 300,
                "07.10.21","10.10.21",1, WorkStatus.BUSY, EliteStatus.C));
        Guest guest2 = hotel.addHotelGuest(new Guest(4,"jonny", 200,
                "07.10.21","09.10.21",1,WorkStatus.BUSY, EliteStatus.B));
    Guest guest3 = hotel.addHotelGuest(new Guest(4,"alex", 500,
            "05.10.21","7.10.21",1, WorkStatus.BUSY, EliteStatus.C));
    Guest guest4 = hotel.addHotelGuest(new Guest(4,"jonny", 100,
            "01.10.21","02.10.21",1,WorkStatus.BUSY, EliteStatus.B));


    public GuestHistory() throws ParseException {
    }
}
