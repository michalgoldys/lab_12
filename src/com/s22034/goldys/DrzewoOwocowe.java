package com.s22034.goldys;

public class DrzewoOwocowe extends
        DrzewoLisciaste{

    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public void zerwijOwoc(){
        System.out.println(
                nazwaOwoca + " zostalo zerwana/e"
        );
    }

    @Override
    public String toString() {
        return "DrzewoOwocowe{" +
                "wiecznieZielone=" + super.wiecznieZielone +
                ", wysokosc=" + super.wysokosc +
                ", przekrojDrzewa='" + super.przekrojDrzewa + '\'' +
                ", nazwaOwoca='" + nazwaOwoca + '\'' +
                '}';
    }
}
