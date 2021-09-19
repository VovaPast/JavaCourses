package database.service;

import database.hotel.Hotel;

public class Service{

    private long price;
    private String title;
    private int id;

    public Service(int id, long price, String title) {
        this.id = id;
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
