package org.example.lesson6.HomeWork;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ram extends NoteBook{
    public void sortRam(List<NoteBook> ctlgCopy) {
        Collections.sort(ctlgCopy, new Comparator<NoteBook>() {
            @Override
            public int compare(NoteBook o1, NoteBook o2) {
                return o1.getRam() - o2.getRam();
            }
        });
    }
