package com.example.demo.domain.data;

import java.util.Arrays;

public class prueba {
    public static void main(String[] args) {
        System.out.println(getCount(1000, 1000, 1_000_000));
        System.out.println(Arrays.toString(args));
    }
    public static int getCount(int p, int k, int n){
        int ktemp2 = (int) Math.ceil(p + k + n / 3);
        int ktemp  =  ktemp2;
        int ktemp3 = 0;
        while (ktemp2 != 0){
            if(ktemp2%3 != 0){
                ktemp3 = ktemp3 + ktemp2%3;
                if (ktemp3 >= 3){
                    ktemp2 = ktemp2 + ktemp3;
                    ktemp3 = ktemp3%3;
                }
            }
            ktemp2 = (int) Math.ceil(ktemp2 / 3);
            ktemp = ktemp + ktemp2;
        }
        int total = p + ktemp  + n;
        return total;
    }

    public int nu(char cha, String s){
        int contador = 0;
        for (int i = 0; i <s.length(); i++){
            if (cha == s.charAt(i)){

            }
        }
        return contador;
    }

    public String cambiaCapitalizacionDeString (String textoACambiar) {
        String nuevoTexto = "";
        for (int i = 0; i < textoACambiar.length(); i++) {
            if (Character.isUpperCase(textoACambiar.charAt(i))) {
                nuevoTexto = nuevoTexto +  Character.toLowerCase(textoACambiar.charAt(i));
            } else {
                nuevoTexto = nuevoTexto +  Character.toUpperCase(textoACambiar.charAt(i));
            }
        }
        if("String".trim() == "String"){


        }
        return nuevoTexto;
    }
}
