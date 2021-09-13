package room;

public interface AdditionalRoomActions {
    boolean putIntoRoom();
    boolean getFromRoom();
    boolean changeStatus(Status newStatus);
}
