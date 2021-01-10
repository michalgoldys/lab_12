package com.s22034.goldys;

public class DrzewoLisciaste extends
        Drzewo{

    int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        super.zerwijOwoc();
    }

    @Override
    public String toString() {
        return "DrzewoLisciaste{" +
                "wiecznieZielone=" + super.wiecznieZielone +
                ", wysokosc=" + super.wysokosc +
                ", przekrojDrzewa='" + super.przekrojDrzewa + '\'' +
                ", ksztaltLiscia=" + ksztaltLiscia +
                '}';
    }
}
