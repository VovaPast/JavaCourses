package database;

import constants.Constants;
import enums.RoomStatus;
import models.Client;
import models.Room;

import java.time.LocalDate;

public class ClientDatabase {

    private static Client[] clients;

    public static Client[] getClients() {
        if (clients == null) {
            initDatabase();
        }
        return clients;
    }

    public static void setClients(Client[] clients) {
        ClientDatabase.clients = clients;
    }

    private static void initDatabase() {

        clients = new Client[Constants.INITIAL_ARRAY_CAPACITY];

        Room room1 = new Room(5, RoomStatus.BUSY, 150, 2, 3);
        Room room2 = new Room(6, RoomStatus.BUSY, 100, 1, 4);
        Room room3 = new Room(7, RoomStatus.BUSY, 50, 1, 2);
        Room room4 = new Room(8, RoomStatus.BUSY, 75, 2, 3);
        Room room5 = new Room(9, RoomStatus.BUSY, 75, 1, 4);
        Room room6 = new Room(15, RoomStatus.BUSY, 10, 1, 4);
        Room room7 = new Room(11, RoomStatus.BUSY, 100, 2, 3);
        Room room8 = new Room(12, RoomStatus.BUSY, 200, 1, 4);
        Room room9 = new Room(13, RoomStatus.BUSY, 85, 1, 2);

        room1.setId(IDGenerator.generateID());
        room2.setId(IDGenerator.generateID());
        room3.setId(IDGenerator.generateID());
        room4.setId(IDGenerator.generateID());
        room5.setId(IDGenerator.generateID());
        room6.setId(IDGenerator.generateID());
        room7.setId(IDGenerator.generateID());
        room8.setId(IDGenerator.generateID());
        room9.setId(IDGenerator.generateID());

        Client client1 = new Client("Boba", "Abobas", room1, LocalDate.now(), LocalDate.now().plusDays(2));
        client1.setId(IDGenerator.generateID());

        Client client2 = new Client("Petr", "Pervi", room2, LocalDate.now(), LocalDate.now().plusDays(3));
        client2.setId(IDGenerator.generateID());

        Client client3 = new Client("Slava", "Ukraine", room3, LocalDate.now(), LocalDate.now().plusDays(1));
        client3.setId(IDGenerator.generateID());

        Client client4 = new Client("Ivan", "Ira", room1, LocalDate.now(), LocalDate.now().plusDays(2));
        client1.setId(IDGenerator.generateID());

        Client client5 = new Client("Ira", "Ivan", room2, LocalDate.now(), LocalDate.now().plusDays(6));
        client2.setId(IDGenerator.generateID());

        Client client6 = new Client("Gaga", "Agag", room3, LocalDate.now(), LocalDate.now().plusDays(3));
        client3.setId(IDGenerator.generateID());

        Client client7 = new Client("Toy", "Magic", room1, LocalDate.now(), LocalDate.now().plusDays(2));
        client1.setId(IDGenerator.generateID());

        Client client8 = new Client("Jojo", "gOLD", room2, LocalDate.now(), LocalDate.now().plusDays(4));
        client2.setId(IDGenerator.generateID());

        Client client9 = new Client("sKADRILIA", "Tatarov", room3, LocalDate.now(), LocalDate.now().plusDays(3));
        client3.setId(IDGenerator.generateID());

        clients[0] = client1;
        clients[1] = client2;
        clients[2] = client3;
        clients[3] = client4;
        clients[4] = client5;
        clients[5] = client6;
        clients[6] = client7;
        clients[7] = client8;
        clients[8] = client9;
    }

}
