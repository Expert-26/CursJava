package md.curs.primalectie;

import javax.swing.*;

public class Printare

    {
        public static void main(String[] orgs){


            byte B = 127;
            int X = 1234567; //initialization
            long A = 1287845454572385789L; //initialization
            float C = 3.1415F;
            Double D = 2349878565.56D;

            String S = "Acesta e un String, adica un tip de date care reprezinta text";
            String S1 = "Invata";
            String S2 = "Aplica";
            String S3 = "Testa rezultatul";
            String S4 = "Voi ";
            String S5 = ", ";


            Boolean F = true; //false or true

            System.out.println("X=" + X); //Am combinat text cu date din variabila
            System.out.println("Long cere ca dupa numar sa fie simbolul L=" + A); //Am combinat text cu date din variabila

            System.out.println("Pi=" + C); //Am combinat text cu date din variabila
            System.out.println("Double permite utilizarea sutimelor + cere ca dupa numar sa fie simbolul D=" + D); //Am combinat text cu date din variabila

            System.out.println("Mesajul este: " + S);

            System.out.println ();
            System.out.println ("Ce noi vom face azi?");
            System.out.println ("Nu stiu cum voi, dar eu: " + S4 + S1 +S5 + S4 + S2 + S5 + S4 + S3 + "!");

            JOptionPane.showMessageDialog( null, "Hai si voi la treaba :)" );
        }

    }


