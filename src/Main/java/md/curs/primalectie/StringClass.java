package md.curs.primalectie;

public class StringClass {

    public static void main(String[] args){

        String text = "Ne place berea";
        String smallText = text.toLowerCase();
        String bigText = text.toUpperCase();
        boolean startsWith = text.startsWith("BBB");
        String[] rezultat = text.split(" ");

        System.out.println("Text  starts with BBB??? " + startsWith);
        System.out.println(smallText);
        System.out.println(bigText);
        System.out.println(rezultat[0] + rezultat[1] + rezultat[2]);

        String x = "blue water";
        String y = "red water";
        String temp = x;

        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}