package hw003;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class colectionSort {
    public static List sortList(List list, Comparator comparator) {
        Collections.sort(list, comparator);
        return list;
    }
}
