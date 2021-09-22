package models;


import java.util.Objects;

public class History extends Essence {

    private long roomId;
    private Client client;

    public History(long roomId, Client client) {
        this.roomId = roomId;
        this.client = client;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        History history = (History) o;
        return roomId == history.roomId &&
                getId() == history.getId() &&
                Objects.equals(client, history.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), roomId, client);
    }

    @Override
    public String toString() {
        return " History | " + " id = " + getId() + " roomId = " + roomId
                + ", client = " + client + '|';
    }
}

