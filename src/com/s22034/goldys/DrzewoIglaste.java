package com.s22034.goldys;

public class DrzewoIglaste extends
        Drzewo{

    int iloscIgiel;
    double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        super.zerwijOwoc();
    }

    @Override
    public String toString() {
        return "DrzewoIglaste{" +
                "wiecznieZielone=" + super.wiecznieZielone +
                ", wysokosc=" + super.wysokosc +
                ", przekrojDrzewa='" + super.przekrojDrzewa + '\'' +
                ", iloscIgiel=" + iloscIgiel +
                ", dlugoscSzyszki=" + dlugoscSzyszki +
                '}';
    }
}
