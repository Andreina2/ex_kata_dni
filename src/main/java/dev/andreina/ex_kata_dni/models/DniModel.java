package dev.andreina.ex_kata_dni.models;


public class DniModel {


    private final char[] dniLetters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public boolean isValid(int dni) {
        return dni >= 0 && dni <= 99999999;
    }

    public char CalculateLetter(int dni) {
        return dniLetters [dni % 23];

    }

}

