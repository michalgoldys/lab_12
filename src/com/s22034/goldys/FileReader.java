package com.s22034.goldys;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader{

    private final String PATH = "C:\\Users\\MM\\IdeaProjects\\mg_labs12\\data.txt";

    public void odczytPliku() throws IOException{

        FileInputStream fis = new FileInputStream(PATH);

        int counter = 0;
        byte[] bytes = fis.readAllBytes();

        for(byte bt : bytes){
            System.out.println(
                    "Wartosc bit: " + bt
            );
            counter++;
        }

        for(byte bt : bytes){
            char znak = (char)bt;
            System.out.println(
                    "Wartosc char: " +znak
            );
        }

        char[] convertedTableFromBytes = new char[counter];
        for (int i = 0; i < bytes.length; i++){
            convertedTableFromBytes[i] = (char)bytes[i];
        }

        byte index;
        int sameLettersCount = 0;

        for(int i = 0; i < bytes.length; i++){
            index = bytes[i];
            for(int j = 0; j < bytes.length; j++){
                if(index == bytes[j]){
                    sameLettersCount++;
                }
            }
            System.out.println("Znak: " + (char)bytes[i] + " Wystapil: " + sameLettersCount + " razy");
            sameLettersCount=0;
        }

        System.out.println(
                "======================================="
                        + "Calkowita ilosc znakow w pliku: " + counter
        );
    }
}