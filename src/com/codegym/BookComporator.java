package com.codegym;

import java.util.Comparator;

public class BookComporator implements Comparator<ManageBook> {

    @Override
    public int compare(ManageBook o1, ManageBook o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
