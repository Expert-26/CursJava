package md.curs.primalectie;

import javax.swing.*;

public class H3Switches {

    public static void main(String[] args) {
        //declarare variabile
        double distanta1 = 57.9;
        double distanta2 = 108.2;
        double distanta3 = 149.5;
        double distanta4 = 227.9;
        double distanta5 = 778.4;
        double distanta6 = 1426.7;
        double distanta7 = 2870.9;
        double distanta8 = 4498.2;

        double raza1 = 0.3825;
        double raza2 = 0.9488;
        double raza4 = 0.53226;
        double raza5 = 11.209;
        double raza6 = 9.449;
        double raza7 = 4.007;
        double raza8 = 3.883;

        System.out.println("Planete: MERCURIU, VENUS, TERRA, MARTE, JUPITER, SATURN, URANUS, NEPTUN");
        String planet =JOptionPane.showInputDialog(null,"Introduceti planeta dorita:");

        System.out.println("Planeta aleasa:" + planet);

        switch(planet) {
            case "MERCURIU":
                System.out.println("Distanța medie față de Soare " + distanta1 + " mln KM.");
                System.out.println("Raza medie: " + raza1 + " din raza Pamantului");
                break;
            case "VENUS":
                System.out.println("Distanța medie față de Soare " + distanta2 + " mln KM.");
                System.out.println("Raza medie: " + raza2 + " din raza Pamantului");
                break;
            case "TERRA":
                System.out.println("Distanța medie față de Soare " + distanta3 + " mln KM.");
                System.out.println("Raza medie: 6378 km");
                break;
            case "MARTE":
                System.out.println("Distanța medie față de Soare " + distanta4 + " mln KM.");
                System.out.println("Raza medie: " + raza4 + " din raza Pamantului");
                break;
            case "JUPITER":
                System.out.println("Distanța medie față de Soare " + distanta5 + " mln KM.");
                System.out.println("Raza medie: " + raza5 + " din raza Pamantului");
                break;
            case "SATURN":
                System.out.println("Distanța medie față de Soare " + distanta6 + " mln KM.");
                System.out.println("Raza medie: " + raza6 + " din raza Pamantului");
                break;
            case "URANUS":
                System.out.println("Distanța medie față de Soare " + distanta7 + " mln KM.");
                System.out.println("Raza medie: " + raza7 + " din raza Pamantului");
                break;
            case "NEPTUN":
                System.out.println("Distanța medie față de Soare " + distanta8 + " mln KM.");
                System.out.println("Raza medie: " + raza8 + " din raza Pamantului");
                break;
            default: System.out.println("Nu exista informatie despre asa obiect cosmic.");
        }
    }
}