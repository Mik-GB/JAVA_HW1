package org.example.lesson6.HomeWork;

import java.util.Collections;
import java.util.Comparator;

public class Os {
    public void sortOperative(List<NoteBook> ctlgCopy) {
        Collections.sort(ctlgCopy, new Comparator<NoteBook>() {
            @Override
            public int compare(NoteBook o1, NoteBook o2) {
                return o1.getOperativeSystem().compareTo(o2.getOperativeSystem());
            }
        });
    }
}
