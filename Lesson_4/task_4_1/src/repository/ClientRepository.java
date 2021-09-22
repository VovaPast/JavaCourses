package repository;

import models.Client;

public interface ClientRepository {

    Client save(Client client);

    boolean remove(Client client);

    boolean update(Client client);

    Client getById(long id);

    Client[] getAll();
}
