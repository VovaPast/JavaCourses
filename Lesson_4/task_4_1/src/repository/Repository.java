package repository;

import constants.Constants;
import database.IDGenerator;
import models.Essence;
import java.util.Arrays;

public abstract class Repository {

    protected abstract Essence[] getDatabaseArray();

    protected abstract void setDatabaseArray(Essence[] essence);

    protected final Essence getEssenceById(long id) {
        final Essence[] essences = getDatabaseArray();
        Essence essence = null;
        for (final Essence currentEssence : essences) {
            if (currentEssence != null && currentEssence.getId() == id) {
                essence = currentEssence;
                break;
            }
        }
        return essence;
    }

    protected final boolean removeEssence(Essence essence) {
        int index = getArrayIndexOfEssence(essence);
        if (index == -1) {
            return false;
        } else {
            getDatabaseArray()[index] = null;
            return true;
        }
    }

    protected final Essence saveEssence(Essence essence) {
        Essence[] essences = getDatabaseArray();
        essence.setId(IDGenerator.generateID());
        boolean flag = false;
        int index;
        for (index = 0; index < essences.length; index++) {
            if (essences[index] == null) {
                essences[index] = essence;
                flag = true;
                break;
            }
        }
        if (!flag) {
            increaseDatabaseArray();
            getDatabaseArray()[index + 1] = essence;
        }
        return essence;
    }

    protected final boolean updateEssence(Essence essence) {
        if (getEssenceById(essence.getId()) == null) {
            return false;
        } else {
            for (int i = 0; i < getDatabaseArray().length; i++) {
                Essence currentEssence = getDatabaseArray()[i];
                if (essence.equals(currentEssence)) {
                    currentEssence = essence;
                    break;

                }
            }
            return true;
        }
    }

    private void increaseDatabaseArray() {
        Essence[] databaseArray = getDatabaseArray();
        final int oldCapacity = databaseArray.length;
        setDatabaseArray(Arrays.copyOf(databaseArray,
                oldCapacity * Constants.INCREASING_NUM_SERVICES));
    }

    private int getArrayIndexOfEssence(Essence entity) {
        int index = -1;
        final Essence[] essences = getDatabaseArray();
        for (int i = 0; i < essences.length; i++) {
            if (entity.equals(essences[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

}
