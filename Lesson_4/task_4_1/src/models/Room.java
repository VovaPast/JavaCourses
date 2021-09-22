package models;

import enums.RoomStatus;

import java.util.Arrays;
import java.util.Objects;

public class Room extends Essence {

    private int num;
    private RoomStatus status;
    private long price;
    private int capacity;
    private int starsNum;
    private Client[] clients;

    public Room(int num, RoomStatus status, long price, int capacity, int starsNum) {
        this.num = num;
        this.status = status;
        this.price = price;
        this.capacity = capacity;
        this.starsNum = starsNum;
        this.clients = new Client[capacity];
    }

    public Room(int num, String status, long price, int capacity, int starsNum) {
        this(num, RoomStatus.valueOf(status.toUpperCase()), price, capacity, starsNum);
    }

    public int getNumber() {
        return num;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public long getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getStarsNum() {
        return starsNum;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setRoomStatus(RoomStatus status) {
        this.status = status;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setStarsNum(int starsNum) {
        this.starsNum = starsNum;
    }

    public void addClient(Client client) {
        this.clients[0] = client;
    }

    public void removeClient() {
        this.clients[0] = null;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Room room = (Room) o;
        return getId() == room.getId() &&
                num == room.num &&
                price == room.price &&
                capacity == room.capacity &&
                starsNum == room.starsNum &&
                status == room.status &&
                Arrays.equals(clients, room.clients);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getId(), num, status, price, capacity, starsNum);
        result = 31 * result + Arrays.hashCode(clients);
        return result;
    }

    @Override
    public String toString() {
        return "Room | " + " id = " + getId() + " number = " + num + ", status = " + status + ", price = " + price +
                ", capacity = " + capacity + ", starsNumber = " + starsNum + ", clients = " + Arrays.toString(clients)
                + '|';
    }
}

