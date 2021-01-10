package com.s22034.goldys;

public class DetektorDymu {

    boolean pozar;

    public DetektorDymu(boolean pozar) {
        this.pozar = pozar;
    }

    public boolean isPozar() {
        return pozar;
    }

    public void setPozar(boolean pozar) {
        this.pozar = pozar;
    }

    public void sprawdz() throws Alarm{
        if(pozar){
            throw new Alarm();
        }
        else {
            System.out.println(
                    "Wszystko OK - nic sie nie pali!!"
            );
        }
    }
}
