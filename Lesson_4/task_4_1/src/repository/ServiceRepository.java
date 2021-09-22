package repository;

import models.Service;

public interface ServiceRepository {

    Service save(Service service);

    boolean remove(Service service);

    boolean update(Service service);

    Service getById(long id);

    Service[] getAll();

}

