package repository;

import enums.WorkStatus;

public interface GuestRepository {
    boolean putIntoGuest();
    boolean getFromGuest();
}
