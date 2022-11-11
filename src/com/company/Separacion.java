package com.company;

import java.util.Scanner;

public class Separacion {
    public static void main(String[] args) {
        //TIENES QUE METER LA CLASE EN UN PACKAGE OBLIGATORIAMENTE

        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String[] partes = frase.split(" ");

        //StringTokenizer stringTokenizer = new StringTokenizer(frase); <-por defecto separa con espacios pero puedes meterle despues de la , el simbolo
        //while(stringTokenizer.hasMoreElements()){
        // String palabra= stringTokenizer.nextToken();
        // System.out.println(palabra)
        // }
        //System.out.println("FIN");

        for (int i = 0; i < partes.length; i++) {

                System.out.println(partes[i]);
        }
        System.out.println(); //O TE DA NULL
    }
}