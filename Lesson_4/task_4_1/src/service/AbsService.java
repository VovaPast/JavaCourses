package service;

import models.Client;
import models.Essence;

import java.util.Arrays;
import java.util.Comparator;

public abstract class AbsService {

    protected abstract Essence[] trimToSize();

    protected final Essence[] sortByComparator(Comparator comparator) {
        final Essence[] copy = trimToSize();
        Arrays.sort(copy, comparator);
        return copy;
    }

}

