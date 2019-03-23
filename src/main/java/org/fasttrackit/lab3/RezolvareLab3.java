package org.fasttrackit.lab3;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class RezolvareLab3 {

static Scanner userImput = new Scanner(System.in);

public static void main (String[] args) {

    System.out.print("Exercitiul 1: ");
    System.out.print("Introduceti cele doua numere sa va fac o medie_");

    double a=userImput.nextDouble();
    double b=userImput.nextDouble();

    double mediaAritmetica = (a+b)/2;
    System.out.println("para pam pam pam, media celor doua numere este: " + mediaAritmetica);
    System.out.println(" " +
            "" +
            "" +
            "");



    System.out.print("Exercitiul 2: ");
    System.out.print("Pentru cate numere sa va fac o medie?_");

    Scanner nNumere=new Scanner(System.in);
    int n = nNumere.nextInt(); double result =0;

    System.out.println("acum va rog sa introduceti cele " + n + " numere");

    int am[]=new int[n];

    for(int i=0;i<n;i++)
        am [i]=nNumere.nextInt();

    for(int i=0;i<n;i++)
        result =result+am[i];


    System.out.println("Media aritmetica este "  + result/n );
    System.out.println(" " +
            "" +
            "" +
            "");


    System.out.print("Exercitiul 3: ");
    System.out.print("Introduceti numerele pentru a determina maximul lor: ");







}


}
