package model;

import java.util.ArrayList;

/**
 * Created by Артем on 01.06.2016.
 */
public class Operations {

    public static <T> ArrayList swap(ArrayList<T> list, int firstIndex, int secondIndex) {
        T temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(firstIndex + 1, temp);
        return list;
    }
}
