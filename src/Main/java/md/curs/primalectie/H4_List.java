package md.curs.primalectie;

import java.util.ArrayList;
import java.util.Scanner;

public class H4_List {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lista1 = {"John","Mike","Joe","Hanna","Mya","Stan","Tina","Kate","Marta","Lao","Kim","Max"};
        System.out.println("Primul pe lista: " + lista1[0]);
        int l = lista1.length;
        if((l % 2)==1) {
            int m = l/2;
            System.out.println("Cel din mijlocul listei este " + lista1[(m)]);
        }
        else {
            int m1 = (l/2-1);
            int m2 = (l/2);
            System.out.println("Cei din mijlocul listei sunt " + lista1[m1] + " si " + lista1[m2]);
        }
        int last = l-1;
        System.out.println("Ultima persoana pe lista este " + lista1[(last)]);
        System.out.println();

        String nume;
        ArrayList<String> lista2 = new ArrayList<String>();
        int j=0;
        for (int i = 0; lista1.length > i; i++) {
            nume = lista1[i];
            if ((nume.startsWith("M")) || (nume.startsWith("m"))) {
                lista2.add(nume);
                j++;
            }
        }
        if (j==0) {
            System.out.println("Nici un nume nu incepe cu litera M");
        }
        else {
            System.out.println("Numele celor ce au prima litera M este ");
            for (String name : lista2) {
                System.out.println(name);
                }
        }
        System.out.println();
        ArrayList<String> lista3 = new ArrayList<String>();
        int k=0;
        for (int i = 0; lista1.length > i; i++) {
            nume = lista1[i];
            if ((nume.indexOf("a")==2)||(nume.indexOf("e")==2)||(nume.indexOf("i")==2)||(nume.indexOf("o")==2)||(nume.indexOf("u")==2)) {
                lista3.add(nume);
                k++;
            }
        }

        if (k==0) {
            System.out.println("Nici un nume nu are a 3-a litera vocala");
        }
        else {
            System.out.println("Numele celor ce au a 3-a litera vocala este ");
            for (String name : lista3) {
                System.out.println(name);
            }
        }
   }

}
