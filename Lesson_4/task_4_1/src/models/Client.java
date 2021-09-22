package models;


import constants.Constants;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Client extends Essence {

    private String firstName;
    private String lastName;
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;
    private Service[] service;

    public Client(String firstName, String lastName, Room room, LocalDate startDate,
                  LocalDate endDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.service = new Service[Constants.INITIAL_ARRAY_CAPACITY];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Service[] getService() {
        return service;
    }

    public void setService(Service[] service) {
        this.service = service;
    }

    void addService(Service services) {
        for (int i = 0; i < service.length; i++) {
            if (service[i] == null) {
                service[i] = services;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Client client = (Client) o;
        return Objects.equals(getId(), client.getId()) &&
                Objects.equals(firstName, client.firstName) &&
                Objects.equals(lastName, client.lastName) &&
                Objects.equals(room, client.room) &&
                Objects.equals(startDate, client.startDate) &&
                Objects.equals(endDate, client.endDate) &&
                Arrays.equals(service, client.service);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getId(), firstName, lastName, room, startDate, endDate);
        result = 31 * result + Arrays.hashCode(service);
        return result;
    }

    @Override
    public String toString() {
        return " Client |" + " id = " + getId() + " firstName= ' " + firstName + '\'' + ", lastName= ' "
                + lastName + '\'' + ", room = " + room + ", startDate = " + startDate + ", endDate = "
                + endDate + ", options = " + Arrays.toString(service) + '|';
    }

}

