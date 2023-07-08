package org.example.lesson6.HomeWork;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OperativeSystem {
    public void sortOperative(List<Notebook> ctlgCopy) {
        Collections.sort(ctlgCopy, new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                return o1.getOperativeSystem().compareTo(o2.getOperativeSystem());
            }
        });
    }
}
