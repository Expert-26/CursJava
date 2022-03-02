package md.curs.primalectie;

import javax.swing.*;
import java.util.Scanner;

public class Intersection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Byte number = Byte.valueOf(JOptionPane.showInputDialog(null, "Introduceti marimea dorita, de la 3 la 50:"));

        if (number >= 3 && number <= 50) {
            System.out.println("Marimea desenului e " + number + " pe " + number);
            int mijloc = (number / 2);

            if ((number % 2) == 1) {
                for (int y = 0; number > y; y++) {
                    System.out.println();
                    if (y == mijloc) {
                        for (int x = 0; number > x; x++) {
                            System.out.print("1");
                        }
                    } else {
                        for (int x = 0; number > x; x++) {
                            if (x == mijloc) {
                                System.out.print("1");
                            } else {
                                System.out.print("0");
                            }
                        }
                    }
                }
            } else {
                for (int y = 0; number > y; y++) {
                    System.out.println();
                    if ((y == mijloc) || (y == mijloc - 1)) {
                        for (int x = 0; number > x; x++) {
                            System.out.print("1");
                        }
                    } else {
                        for (int x = 0; number > x; x++) {
                            if ((x == mijloc) || (x == mijloc - 1)) {
                                System.out.print("1");
                            } else {
                                System.out.print("0");
                            }
                        }
                    }
                }
            }
        }
        else {
            System.out.print("Marime nepotrivita.");
        }
    }
}
