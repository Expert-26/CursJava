package md.curs.primalectie;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whaat is your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}