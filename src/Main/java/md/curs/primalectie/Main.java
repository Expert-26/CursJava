package md.curs.primalectie;

import javax.swing.*;

public class Main {
    public static void main(String[] orgs){
        System.out.println("Noi iubim berea");
        System.out.print("Berea este buna\n");
        System.out.println("Berea este cea mai buna");
        // This is a comment

        /*
        This Is
        A Multiline
        Comment
         */

        int X = 1234567; //initialization
        long A = 1287845454572385789L; //initialization
        byte B = 127;
        float C = 3.1415F;
        Double D = 2349878565.56D;

        String S1 = "Invata";
        String S2 = "Aplica";
        String S3 = "Testa rezultatul";
        String S4 = "Voi ";
        String S5 = ", ";


        Boolean F = true; //false or true

        System.out.println("X=" + X); //Am combinat text cu date din variabila
        System.out.println("Long cere ca dupa numar sa fie simbolul L=" + A); //Am combinat text cu date din variabila
        System.out.println ();
        System.out.println ("Ce noi vom face azi?");
        System.out.println ("Nu stiu cum voi, dar eu: " + S4 + S1 +S5 + S4 + S2 + S5 + S4 + S3 + "!");

        JOptionPane.showMessageDialog( null, "Hai si voi la treaba :)" );
    }

}
