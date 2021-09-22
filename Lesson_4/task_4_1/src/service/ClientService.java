package service;

import models.Client;
import models.Service;

public interface ClientService {

    Client saveClient(Client client);

    boolean removeClient(Client client);

    boolean updateClient(Client client);

    Client[] getAllClients();

    Client getClientById(long id);

    int getClientsCount();

    Client[] getAllClientsSortedByLastName();

    Client[] getAllClientsSortedByEndDate();

    long getTotalPrice(long clientId);

}
