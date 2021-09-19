package repository;

import enums.WorkStatus;

public interface RoomRepository {

        boolean putIntoRoom();
        boolean getFromRoom();
        boolean changeWorkStatus(WorkStatus newWorkStatus);

}
