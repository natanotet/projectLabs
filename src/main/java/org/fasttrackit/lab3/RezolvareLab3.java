package org.fasttrackit.lab3;

import java.sql.SQLOutput;
import java.util.Scanner;
public class RezolvareLab3 {

static Scanner userImput = new Scanner(System.in);

public static void main (String[] args) {

    System.out.print("Exercitiul 1: ");
    System.out.print("Introduceti cele doua numere sa va fac o medie_");

    double a=userImput.nextDouble();
    double b=userImput.nextDouble();

    double mediaAritmetica = (a+b)/2;
    System.out.println("para pam pam pam, media celor doua numere este: " + mediaAritmetica);







    }


}
