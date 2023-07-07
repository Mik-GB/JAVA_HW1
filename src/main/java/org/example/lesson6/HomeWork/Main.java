package org.example.lesson6.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoteBook notebook = new NoteBook();
        NoteBook notebook1 = new NoteBook("Asus", 16, 1024, "Windows", "red");
        NoteBook notebook2 = new NoteBook("Lenovo", 8, 512, "Linux", "white");
        NoteBook notebook3 = new NoteBook("Apple", 16, 1024, "Mac OS", "red");
        NoteBook notebook4 = new NoteBook("DEXP", 8, 2048, "Windows", "black");
        List<NoteBook> catalog = new ArrayList<>();
        catalog.add(notebook);
        catalog.add(notebook1);
        catalog.add(notebook2);
        catalog.add(notebook3);
        catalog.add(notebook4);
        Scanner scanner = new Scanner(System.in);
        menu(scanner, catalog);
    }

    private static void menu(Scanner sc, List<NoteBook> ctlg) {
        boolean flag = true;
        List<NoteBook> catalogCopy = new ArrayList<>(ctlg);
        while (flag) {
            System.out.println();
            System.out.println(new Text().selectionMenu);
            System.out.println(new Text().selection);
            int selection = sc.nextInt();
            switch (selection) {
                case 1:
                    for (NoteBook s : ctlg) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    sortNotebook(catalogCopy, sc);
                    for (NoteBook s : catalogCopy) {
                        System.out.println("Notebook " + s);
                    }
                    break;
                case 3:
                    List<NoteBook> filter = filterNotebook(ctlg, sc);
                    if(!filter.isEmpty()){
                        System.out.println(new Text().foundItems);
                        for (NoteBook s : filter) {
                            System.out.println(s);
                        }
                    }else {
                        System.out.println(new Text().notFound);
                    }
                    break;
                case 4:
                    flag = false;
                    System.out.println(new Text().exit);
            }
        }

    }

    private static List<NoteBook> filterNotebook(List<NoteBook> ctlg, Scanner sc) {
        List<NoteBook> myList = new ArrayList<>();
        System.out.println(new Text().menuEnter);
        System.out.println(new Text().searchPart);
        int partSearch = sc.nextInt();
        switch (partSearch) {
            case 1:
                System.out.println(new Text().searchElem);
                String case1 = sc.next().toLowerCase();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getManufacturer().toLowerCase().equals(case1)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
            case 2:
                System.out.println(new Text().searchElem);
                int case2 = sc.nextInt();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getRam().equals(case2)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
            case 3:
                System.out.println(new Text().searchElem);
                int case3 = sc.nextInt();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getVolumeVD().equals(case3)) {
                        myList.add(ctlg.get(i));                    }
                }
                break;
            case 4:
                System.out.println(new Text().searchElem);
                String case4 = sc.next().toLowerCase();
                for (int i = 0; i < ctlg.size(); i++) {

                    if (ctlg.get(i).getOperativeSystem().toLowerCase().equals(case4)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
            case 5:
                System.out.println(new Text().searchElem);
                String case5 = sc.next().toLowerCase();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getColor().toLowerCase().equals(case5)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
        }
        return myList;
    }

        }
    }
}
