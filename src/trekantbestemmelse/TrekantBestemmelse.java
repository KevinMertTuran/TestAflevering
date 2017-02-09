/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trekantbestemmelse;

import java.util.Scanner;

/**
 *
 * @author kevinturan
 */
public class TrekantBestemmelse {

    static Scanner scan = new Scanner(System.in);

    static int a = 0;
    static int b = 0;
    static int c = 0;

    public static void main(String[] args) {

        System.out.println("Enter value for 'a'");
        a = scan.nextInt();

        System.out.println("Enter value for 'b'");
        b = scan.nextInt();

        System.out.println("Enter value for 'c'");
        c = scan.nextInt();

        if (a < b + c && b < a + c && c < a + b) {

            if (a == b && b == c) {
                System.out.println("Ligesidet Trekant");

            } else if (a != b && b != c && c != a) {
                System.out.println("Scalene Triangle");

            } else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a)) {
                System.out.println("Ligebenet Trekant");
            }

        } else {
            System.out.println("Not a triangle");
        }

    }

}
 

// Tjek om ddet er en trekant overhovedet først. 
// Lav try catch med SOUT, for at se om inputene er integers som ønsket. 
// Tjek om det trekant, beregn output, også output. 
// JaCoCoverage
// Switchcases maybe ????