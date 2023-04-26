package person.comparators;

import interfaces.Anthropoid;

import java.util.Comparator;

public class PersonComparatorByLastName<E extends Anthropoid> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}