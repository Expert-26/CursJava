package md.curs.primalectie;

import javax.swing.*;
import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qPaine = 0;
        int qBere = 0;
        int total = 0;
        int rest = 0;


        System.out.println("Numele vostru? ");
        String surname = scanner.nextLine();

        System.out.println("Prenumele? ");
        String name = scanner.nextLine();

        System.out.println("Varsta? ");
        int age = Integer.parseInt(scanner.nextLine());
        if(age >= 120) {JOptionPane.showInputDialog ("Varsta e indicata gresit.");}
        else{
            System.out.println();
            System.out.println("Doriti paine 5lei/buc? (Raspuns: Da/Nu)");

            String paine = scanner.nextLine();
            if(paine.equalsIgnoreCase("da")) {
            System.out.println("Cantitatea?");
            qPaine = Integer.parseInt(scanner.nextLine());}
            else if(paine.equalsIgnoreCase("nu")) {} //no action
            else {
                System.out.println("Raspuns necunoscut");
            }

            if(age >= 18) {
                System.out.println("Doriti bere 50lei/sticla? (Raspuns: Da/Nu)");
                String bere = scanner.nextLine();
                if (bere.equalsIgnoreCase("da")) {
                    System.out.println("Cantitatea?");
                    qBere = Integer.parseInt(scanner.nextLine());
                }
               else if(bere.equalsIgnoreCase("nu")) {} //no action
               else {
                    System.out.println("Raspuns necunoscut");
                    }
            }
            total = (qPaine * 5) + (qBere * 50);
            if (total<=0) {
                System.out.println("Total = " + total + "\n Va multumim.");
            }
            else {
                System.out.println("Total = " + total + "\n Cati bani introduceti spre achitare?");
                int payment = Integer.parseInt(scanner.nextLine());

                if(total > payment) {
                    JOptionPane.showInputDialog(null,"Suma e insuficienta");
                }
                else {
                    rest = payment - total;
                    System.out.println(" Numele " + surname +
                            "\n Prenume " + name +
                            "\n Varsta " + age +
                            "\n Ati cumparat in valoare de: " + total +
                            "\n Rest: " + rest +
                            "\n Va multumim pentru cumparaturi!");

                /* Object string;
                 JOptionPane.showMessageDialog(null,
                     string [] "Numele "+ surname +
                        "\n Prenume " + name +
                        "\n Varsta " + age +
                        "\n Ati cumparat in valoare de: " + total +
                        "\n Rest: " + rest +
                        "\n Va multumim pentru cumparaturi!");
                 */
                }
            }
        }

    }
}
