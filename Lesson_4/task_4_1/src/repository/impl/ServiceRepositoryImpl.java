package repository.impl;

import database.ServiceDatabase;
import models.Essence;
import models.Service;
import repository.Repository;
import repository.ServiceRepository;

public class ServiceRepositoryImpl extends Repository implements ServiceRepository {

    @Override
    protected Essence[] getDatabaseArray() {
        return ServiceDatabase.getService();
    }

    @Override
    protected void setDatabaseArray(Essence[] essences) {
        ServiceDatabase.setService((Service[]) essences);
    }

    @Override
    public Service save(Service service) {
        return (Service) saveEssence(service);
    }

    @Override
    public boolean remove(Service service) {
        return removeEssence(service);
    }

    @Override
    public boolean update(Service service) {
        return updateEssence(service);
    }

    @Override
    public Service getById(long id) {
        return (Service) getEssenceById(id);
    }

    @Override
    public Service[] getAll() {
        return (Service[]) getDatabaseArray();
    }
}

