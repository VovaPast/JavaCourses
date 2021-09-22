package service.impl;

import comporator.ClientEndDateComparator;
import comporator.ClientLastNameComparator;
import database.ClientDatabase;
import models.Client;
import models.Service;
import repository.ClientRepository;
import service.AbsService;
import service.ClientService;

import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class ClientServiceImpl extends AbsService implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public boolean removeClient(Client client) {
        return clientRepository.remove(client);
    }

    @Override
    public boolean updateClient(Client client) {
        return clientRepository.update(client);
    }

    @Override
    public Client[] getAllClients() {
        return trimToSize();
    }

    @Override
    public Client getClientById(long id) {
        return clientRepository.getById(id);
    }

    @Override
    public int getClientsCount() {
        return trimToSize().length;
    }

    @Override
    public Client[] getAllClientsSortedByLastName() {
        return (Client[]) sortByComparator(new ClientLastNameComparator());
    }

    @Override
    public Client[] getAllClientsSortedByEndDate() {
        return (Client[]) sortByComparator(new ClientEndDateComparator());
    }

    @Override
    public long getTotalPrice(long clientId) {
        final Client client = getClientById(clientId);
        if (client == null) {
            return 0;
        }
        long sum = 0;
        final long price = client.getRoom().getPrice();
        final long days = client.getStartDate().until(client.getEndDate(), ChronoUnit.DAYS);
        final Service[] services = client.getService();
        for (Service service : services) {
            if (service != null) {
                sum += service.getPrice();
            }
        }
        sum += price * days;
        return sum;
    }

    @Override
    protected Client[] trimToSize() {
        int capacity = 0;
        final Client[] clients = ClientDatabase.getClients();
        for (Client client : clients) {
            if (client != null) {
                capacity++;
            }
        }
        Client[] withoutNullsArray = new Client[capacity];
        int index = 0;
        for (Client client : clients) {
            if (client != null) {
                withoutNullsArray[index++] = client;
            }
        }
        return Arrays.copyOf(withoutNullsArray, withoutNullsArray.length);
    }

}

