package com.s22034.goldys;

public class Main {

    public static void main(String[] args) throws Exception {

        DrzewoIglaste sosna = new DrzewoIglaste(true, 10,"200",50000, 5);
        DrzewoIglaste modrzew = new DrzewoIglaste(true,6,"150",25000,3);
        DrzewoLisciaste dab = new DrzewoLisciaste(false,15,"250",32);
        DrzewoOwocowe sliwa = new DrzewoOwocowe(false,6,"50",25,"Sliwka");
        DrzewoOwocowe jablon = new DrzewoOwocowe(false,4,"60",6,"Jablko");

        Drzewo[] drzewo = {sosna, modrzew, dab, sliwa, jablon};

        for(Drzewo d : drzewo){
            System.out.println(
                    d
            );
        }

        Rakieta rakieta = new Rakieta("Prometeusz",800);
        Rakieta rakieta1 = new Rakieta("Amadeusz", 1200);

        System.out.println(
                rakieta
        );

        rakieta.zatankuj(100);
        rakieta.zatankuj(100);

        System.out.println(
                rakieta1
        );

        rakieta.start();
        rakieta1.start();

        FileReader fileReader = new FileReader();
        fileReader.odczytPliku();
    }
}