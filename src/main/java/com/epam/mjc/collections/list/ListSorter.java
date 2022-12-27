package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int firstString = Integer.parseInt(a);
        int secondString = Integer.parseInt(b);
        int result = Integer.compare(5 * firstString * firstString + 3, 5 * secondString * secondString + 3);
    
        return result != 0 ? result : Integer.compare(firstString, secondString);
    }
}
