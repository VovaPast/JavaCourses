package repository.impl;

import repository.HistoryRepository;
import database.HistoryDatabase;
import models.Essence;
import models.History;
import repository.Repository;

public class HistoryRepositoryImpl extends Repository implements HistoryRepository {

    @Override
    protected Essence[] getDatabaseArray() {
        return HistoryDatabase.getHistory();
    }

    @Override
    protected void setDatabaseArray(Essence[] essences) {
        HistoryDatabase.setHistory((History[]) essences);
    }

    @Override
    public History save(History history) {
        return (History) saveEssence(history);
    }

    @Override
    public boolean update(History history) {
        return updateEssence(history);
    }

    @Override
    public boolean remove(History history) {
        return removeEssence(history);
    }

    @Override
    public History getById(long id) {
        return (History) getEssenceById(id);
    }

    @Override
    public History[] getAll() {
        return (History[]) getDatabaseArray();
    }
}

