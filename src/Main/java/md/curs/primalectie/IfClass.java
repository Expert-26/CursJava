package md.curs.primalectie;

        import java.util.Scanner;

public class IfClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu varsta ");
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 100) { //also can be used
            System.out.println("You are dead");
        } else if(age >= 18) {
            System.out.println("You are adult");
        }
        else {
            System.out.println("You are malaletka");
        }
    }
}