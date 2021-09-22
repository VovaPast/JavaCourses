package database;

import constants.Constants;
import enums.RoomStatus;
import models.Client;
import models.History;
import models.Room;

import java.time.LocalDate;

public class HistoryDatabase {

    private static History[] history;

    public static History[] getHistory() {
        if (history == null) {
            initHistory();
        }
        return history;
    }

    public static void setHistory(History[] history) {
        HistoryDatabase.history = history;
    }

    private static void initHistory() {

        history = new History[Constants.INITIAL_ARRAY_CAPACITY];
        Room room = new Room(11, RoomStatus.FREE, 300_000, 1, 5);
        final long roomId = IDGenerator.generateID();
        room.setId(Constants.ROOM_ID);

        Client client1 = new Client("Alex", "qwe", room,
                LocalDate.of(2020, 1, 25),
                LocalDate.of(2020, 1, 28));

        Client client2 = new Client("Fads", "asd", room,
                LocalDate.of(2020, 2, 14),
                LocalDate.of(2020, 2, 15));

        Client client3 = new Client("Prima", "zxc", room,
                LocalDate.of(2020, 3, 3),
                LocalDate.of(2020, 3, 5));

        Client client4 = new Client("Delphi", "cxz", room,
                LocalDate.of(2020, 4, 24),
                LocalDate.of(2020, 4, 25));

        Client client5 = new Client("Zelda", "dsa", room,
                LocalDate.of(2020, 5, 19),
                LocalDate.of(2020, 5, 20));

        Client client6 = new Client("Rick", "ewq", room,
                LocalDate.of(2020, 6, 11),
                LocalDate.of(2020, 6, 25));

        History history1 = new History(Constants.ROOM_ID, client1);
        History history2 = new History(Constants.ROOM_ID, client2);
        History history3 = new History(Constants.ROOM_ID, client3);
        History history4 = new History(Constants.ROOM_ID, client4);
        History history5 = new History(Constants.ROOM_ID, client5);
        History history6 = new History(Constants.ROOM_ID, client6);

        history1.setId(IDGenerator.generateID());
        history2.setId(IDGenerator.generateID());
        history3.setId(IDGenerator.generateID());
        history4.setId(IDGenerator.generateID());
        history5.setId(IDGenerator.generateID());
        history6.setId(IDGenerator.generateID());

        history[0] = history1;
        history[1] = history2;
        history[2] = history3;
        history[3] = history4;
        history[4] = history5;
        history[5] = history6;

        client1.setId(IDGenerator.generateID());
        client2.setId(IDGenerator.generateID());
        client3.setId(IDGenerator.generateID());
        client4.setId(IDGenerator.generateID());
        client5.setId(IDGenerator.generateID());
        client6.setId(IDGenerator.generateID());

    }

}

