package hotel;

import room.Room;
import room.Status;
import service.Service;
import java.util.Arrays;

public class Hotel implements HotelActions {

    private static final int INCREASING_NUM_SERVICES = 2;

    private Room[] hotelRooms;
    private Service[] hotelServices;
    private int currentNumberHotelRooms = 0;
    private int currentNumberHotelServices = 0;

    public Hotel(int initialNumberHotelServices, int initialNumberHotelRooms) {
        this.hotelRooms = new Room[initialNumberHotelRooms];
        this.hotelServices = new Service[initialNumberHotelServices];
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
    public boolean changeStatusHotelRoom(Room hotelRoom, Status status) {
        return hotelRoom.changeStatus(status);
    }

    @Override
    public long changeHotelRoomPrice(Room hotelRoom, long newPrice) {
        return hotelRoom.changeProductPrice(newPrice);
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
        return hotelService.changeProductPrice(newPrice);
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

    private void increaseHotelServicesArray(Service[] hotelServices) {
        this.hotelServices = Arrays.copyOf(hotelServices, hotelServices.length * INCREASING_NUM_SERVICES);
    }

    private void increaseHotelRoomsArray(Room[] hotelRooms) {
        this.hotelRooms = Arrays.copyOf(hotelRooms, hotelRooms.length * INCREASING_NUM_SERVICES);
    }

    public Service[] getHotelServices() {
        return hotelServices;
    }

    public Room[] getHotelRooms() {
        return hotelRooms;
    }

    public Room getHotelRoomById(int id) {
        return hotelRooms[id];
    }

    public Service getHotelServiceById(int id) {
        return hotelServices[id];
    }
}
