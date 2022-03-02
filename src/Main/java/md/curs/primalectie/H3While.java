package md.curs.primalectie;

import javax.swing.*;
import java.util.Scanner;

public class H3While {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar aleator de la 1 la 100.");
        int n = Integer.parseInt(scanner.nextLine());
        if (n <= 0 || n >= 101) {
            JOptionPane.showInputDialog("A fost aleasa o valoare nepotrivita.");
        } else {
            String A = "A";

            while (n > 0) {
                System.out.print(A);
                n = n - 1;
                A = A + "A";
                System.out.println();
            }

        }

    }
}
