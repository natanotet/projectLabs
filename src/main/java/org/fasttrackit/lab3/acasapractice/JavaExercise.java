package org.fasttrackit.lab3.acasapractice;

import java.sql.SQLOutput;
import java.util.Scanner;


public class JavaExercise {

    static Scanner userImput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("numarul tau favorit");

        if (userImput.hasNextInt()) {

            int numberedEntered = userImput.nextInt();

            System.out.println("ati introdus " + numberedEntered);

            int numberEnteredTwo = numberedEntered + numberedEntered;

            System.out.println(numberedEntered + " + " + numberedEntered + " = " + numberEnteredTwo);


            int numberEnteredThree = numberedEntered - 29;

            System.out.println(numberedEntered + " - 29 " + " = " + numberEnteredThree);


            int numberEnteredFour = numberedEntered * 29;

            System.out.println(numberedEntered + " x " + 29 + " = " + numberEnteredFour);


            int numberEnteredFive = numberedEntered / 2;

            System.out.println(numberedEntered + " : 2" + " = " + numberEnteredFive);

            numberedEntered++;


            int numberABS = Math.abs(numberedEntered);
            int careiMaiMare = Math.max(numberEnteredFive, numberedEntered);

            System.out.println(careiMaiMare);

            double laPatrat = Math.sqrt(23);
            System.out.println("patratul acesta este " + laPatrat);

            int numLaTavam = (int) Math.ceil(5.23);
            System.out.println("ia sa vedem rezultatul " + numLaTavam);

            int numLaPodea = (int) Math.floor(5.23);
            System.out.println("ia sa vedem rezultatul asta ni " + numLaPodea);

            int randomNumber = (int) (Math.random() * 100);
            System.out.println("si numarul castigator al inimii lui Natan esteeee " + randomNumber + " da da dammm");

        }

        System.out.print("Acum cu multe respecte va rog introduceti cele doua numere: ");

        if (userImput.hasNextDouble()) {


           int numar1 = userImput.nextInt();
           int numar2 = userImput.nextInt();

           int mediaAritmetica = (numar1 + numar2) / 2;

           System.out.println("media aritmetica a celor doua numere este " + mediaAritmetica);

       }




        else {

            System.out.println("Baga un integer data viitoare fa ");
        }

        System.out.print("Exercitiul 2: ");
        System.out.print("Pentru cate numere sa va fac o medie?_");

        Scanner nNumere=new Scanner(System.in);
        int n = nNumere.nextInt(); double result =0;

        System.out.println("acum va rog sa introduceti cele " + n + " numere");

        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a [i]=nNumere.nextInt();

        for(int i=0;i<n;i++)
            result =result+a[i];


        System.out.println("Media aritmetica este "  + result/n );













    }



}
