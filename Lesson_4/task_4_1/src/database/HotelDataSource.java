package database;

import database.guest.Guest;
import database.hotel.Hotel;
import database.room.Room;
import database.service.Service;
import enums.EliteStatus;
import enums.WorkStatus;
import repository.HotelRepository;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public abstract class HotelDataSource implements HotelRepository{

     Hotel hotel = new Hotel(5, 3,3);
     List<Room> rooms = new ArrayList<Room>();
     List<Service> services = new ArrayList<Service>();
     List<Guest> guests = new ArrayList<Guest>();


    Room room1 = hotel.addHotelRoom(new Room(1,100,1, WorkStatus.BUSY, EliteStatus.C));
    Room room2 = hotel.addHotelRoom(new Room(2,150,1, WorkStatus.FREE, EliteStatus.B));
    Room room3 = hotel.addHotelRoom(new Room(3,100,1, WorkStatus.FREE, EliteStatus.C));
    Room room4 = hotel.addHotelRoom(new Room(4,150,1, WorkStatus.BUSY, EliteStatus.B));
    Room room5 = hotel.addHotelRoom(new Room(5,100,1, WorkStatus.FREE, EliteStatus.C));
    Room room6 = hotel.addHotelRoom(new Room(6,300,1, WorkStatus.FREE, EliteStatus.A));

    Service service1 = hotel.addHotelService(new Service(1,55, "уборка"));
    Service service2 = hotel.addHotelService(new Service(2,300,"шведский стол"));
    Service service3 = hotel.addHotelService(new Service(3,100,"бар без лимита"));
    Service service4 = hotel.addHotelService(new Service(4,100,"1-ое, 2-ое, 3-е,"));

    Guest guest1 = hotel.addHotelGuest(new Guest(1,"alex", room1.getPrice()*3,
            "10.10.21","13.10.21",1, WorkStatus.BUSY, EliteStatus.C));
    Guest guest2 = hotel.addHotelGuest(new Guest(4,"jonny", room4.getPrice()*2,
            "10.10.21","12.10.21",1,WorkStatus.BUSY, EliteStatus.B));


    public HotelDataSource() throws ParseException {

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        rooms.add(room6);

        services.add(service1);
        services.add(service2);
        services.add(service3);
        services.add(service4);

        guests.add(guest1);
        guests.add(guest2);
    }


    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
