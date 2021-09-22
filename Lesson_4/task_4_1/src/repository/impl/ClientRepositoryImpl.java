package repository.impl;

import database.ClientDatabase;
import models.Client;
import models.Essence;
import repository.ClientRepository;
import repository.Repository;

public class ClientRepositoryImpl extends Repository implements ClientRepository {

    @Override
    protected Essence[] getDatabaseArray() {
        return ClientDatabase.getClients();
    }

    @Override
    protected void setDatabaseArray(Essence[] essences) {
        ClientDatabase.setClients((Client[]) essences);
    }

    @Override
    public Client save(Client client) {
        return (Client) saveEssence(client);
    }

    @Override
    public boolean remove(Client client) {
        return removeEssence(client);
    }

    @Override
    public boolean update(Client client) {
        return updateEssence(client);
    }

    @Override
    public Client getById(long id) {
        return (Client) getEssenceById(id);
    }

    @Override
    public Client[] getAll() {
        return (Client[]) getDatabaseArray();
    }
}

