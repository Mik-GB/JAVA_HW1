package org.example.lesson6.HomeWork;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Color extends NoteBook{
    public void sortColor(List<NoteBook> ctlgCopy) {
        Collections.sort(ctlgCopy, new Comparator<NoteBook>() {
            @Override
            public int compare(NoteBook o1, NoteBook o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        });
    }
}