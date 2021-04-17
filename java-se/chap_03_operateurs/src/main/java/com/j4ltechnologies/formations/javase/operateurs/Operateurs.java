package com.j4ltechnologies.formations.javase.operateurs;

/**
 * Classe Operateurs, créée le 17/04/2021 à 19:05
 *
 * @author Joachim Zadi
 * @version 1.0 du 17/04/2021
 */
public class Operateurs {
    public static void main(String[] args) {
        /*
         * Operateurs Arithmetiques (+,-,*,/,%)
         * Operateurs Relationnels (>,>=,==,!=,<=,<)
         * Operateurs Assignations (=, ++)
         */
        int poids = 15;

        System.out.printf("poids = %s%n", poids);

        // poids++; Operateur de post-incrementation

        System.out.printf("poids = %s%n", poids++);

        // ++poids; Operateur de pre-incrementation
        System.out.printf("poids = %s%n", ++poids);

        // poids--; Operateur de post-decrementation

        System.out.printf("poids = %s%n", poids--);

        // --poids; Operateur de pre-decrementation
        System.out.printf("poids = %s%n", --poids);

        poids += 5;// poids = poids + 5;
        System.out.printf("poids = %s%n", poids);

        /*
         * Les Operateurs Logiques ( &&, &, ||, |, ^, ! )
         */
        boolean a = true;
        boolean b = false;

        System.out.printf("a && b = %s%n", a && b);
        System.out.printf("a & b = %s%n", a & b);

        System.out.printf("a || b = %s%n", a || b);
        System.out.printf("a | b = %s%n", a | b);

        System.out.printf("a ^ b = %s%n", a ^ b);
        System.out.printf("!a = %s%n", !a);

        //Prioririté des operateurs
        int j = 1, k = -5;
        System.out.println("priorité = " + 3 * poids++ * --j + k++);
    }
}