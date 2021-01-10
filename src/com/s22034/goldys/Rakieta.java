package com.s22034.goldys;

public class Rakieta {

    String nazwa;
    int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj(int iloscPaliwa){
        this.wagaPaliwa += iloscPaliwa;
        System.out.println(
                "Zatankowano: " + iloscPaliwa
        );
    }

    public void start() throws Exception{
        if(wagaPaliwa<1000){
            throw new Exception(
                    "Konieczna wieksza ilosc paliwa: " + this.wagaPaliwa
                            + " to za malo by odleciec!!!"
                            + " Potrzeba jeszcze: " + (1000-this.wagaPaliwa)
            );
        } else{
            System.out.println("Zapiac pasy, odpalamy silniki!");
        }
    }

    @Override
    public String toString() {
        return "Rakieta{" +
                "nazwa='" + nazwa + '\'' +
                ", wagaPaliwa=" + wagaPaliwa +
                '}';
    }
}
