package database.hotel;

import database.guest.Guest;
import database.room.Room;
import database.service.Service;
import enums.WorkStatus;
import repository.HotelRepository;


import java.util.Arrays;

public class Hotel implements HotelRepository{

    private static final int INCREASING_NUM_SERVICES = 2;

    private Room[] hotelRooms;
    private Service[] hotelServices;
    private Guest[] hotelGuests;
    private int currentNumberHotelRooms = 0;
    private int currentNumberHotelServices = 0;
    private int currentNumberHotelGuests = 0;

    public Hotel(int initialNumberHotelServices, int initialNumberHotelRooms, int initialNumberHotelGuests){
        this.hotelRooms = new Room[initialNumberHotelRooms];
        this.hotelServices = new Service[initialNumberHotelServices];
        this.hotelGuests = new Guest[initialNumberHotelGuests];

    }

    @Override
    public boolean putIntoHotelRoom(Room hotelRoom) {
        return hotelRoom.putIntoRoom();
    }

    @Override
    public boolean getFromHotelRoom(Room hotelRoom) {
        return hotelRoom.getFromRoom();
    }

    @Override
    public boolean changeStatusHotelRoom(Room hotelRoom, WorkStatus workStatus) {
        return false;
    }

    @Override
    public long changeHotelRoomPrice(Room hotel, long newPrice) {
        return 0;
    }

    @Override
    public Room addHotelRoom(Room hotelRoom) {
        if (currentNumberHotelRooms == hotelRooms.length) {
            increaseHotelRoomsArray(hotelRooms);
        }
        hotelRoom.setId(currentNumberHotelRooms);
        this.hotelRooms[currentNumberHotelRooms++] = hotelRoom;
        return hotelRoom;
    }

    @Override
    public long changeServicePrice(Service hotelService, long newPrice) {
        return 0;
    }

    @Override
    public Service addHotelService(Service hotelService) {
        if (currentNumberHotelServices == hotelServices.length) {
            increaseHotelServicesArray(hotelServices);
        }
        hotelService.setId(currentNumberHotelServices);
        this.hotelServices[currentNumberHotelServices++] = hotelService;
        return hotelService;
    }

    @Override
    public Guest addHotelGuest(Guest hotelGuest) {
        if (currentNumberHotelGuests == hotelGuests.length) {
            increaseHotelGuestsArray(hotelGuests);
        }
        hotelGuest.setId(currentNumberHotelGuests);
        this.hotelGuests[currentNumberHotelGuests++] = hotelGuest;
        return hotelGuest;
    }

    private void increaseHotelServicesArray(Service[] hotelServices) {
        this.hotelServices = Arrays.copyOf(hotelServices, hotelServices.length * INCREASING_NUM_SERVICES);
    }

    private void increaseHotelRoomsArray(Room[] hotelRooms) {
        this.hotelRooms = Arrays.copyOf(hotelRooms, hotelRooms.length * INCREASING_NUM_SERVICES);
    }

    private void increaseHotelGuestsArray(Guest[] hotelGuests) {
        this.hotelGuests = Arrays.copyOf(hotelGuests, hotelGuests.length * INCREASING_NUM_SERVICES);
    }

    @Override
    public Service[] getHotelServices() {
        return hotelServices;
    }

    @Override
    public Room[] getHotelRooms() {
        return new Room[0];
    }

    @Override
    public Room getHotelRoomById(int id) {
        return hotelRooms[id];
    }

    @Override
    public Service getHotelServiceById(int id) {
        return hotelServices[id];
    }
}
