/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trekantbestemmelse;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kevinturan
 */
public class TrekantBestemmelse {

    static Scanner scan = new Scanner(System.in);

    private static int a, b, c;

    public static void main(String[] args) {

        try {

            System.out.println("Enter value for 'a'");

            a = scan.nextInt();

            System.out.println("Enter value for 'b'");
            b = scan.nextInt();

            System.out.println("Enter value for 'c'");
            c = scan.nextInt();

        } catch (InputMismatchException | NumberFormatException e) {

            System.out.println("Error! You cannot insert symbols, only Integers!");
        }

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
