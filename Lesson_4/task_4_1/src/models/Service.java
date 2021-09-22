package models;

import enums.ServicePartition;

import java.time.LocalDateTime;
import java.util.Objects;

public class Service extends Essence {

    private long price;
    private String title;
    private ServicePartition partition;
    private LocalDateTime date;

    public Service(long price, String title, ServicePartition partition, LocalDateTime date) {
        this.price = price;
        this.title = title;
        this.partition = partition;
        this.date = date;
    }

    public Service(long price, String title, ServicePartition partition) {
        this(price, title, partition, LocalDateTime.now());
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ServicePartition getPartition() {
        return partition;
    }

    public void setServicePartition(ServicePartition partition) {
        this.partition = partition;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Service service = (Service) o;
        return getId() == service.getId() &&
                price == service.price &&
                Objects.equals(title, service.title) &&
                Objects.equals(date, service.getDate()) &&
                partition == service.partition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), price, title, partition, date);
    }

    @Override
    public String toString() {
        return " Service | " + " id = " + getId() + " price = " + price + ", title = ' " + title + '\'' +
                ", partition = " + partition + ", date = " + date + '|';
    }
}

