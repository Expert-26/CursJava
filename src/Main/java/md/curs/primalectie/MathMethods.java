package md.curs.primalectie;

import java.util.Scanner;

public class MathMethods {

    public static void main(String[] args) {
        String operation = "";
        String repeat = "yes";

        while (repeat.equals("yes") || repeat.equals("YES") || repeat.equals("y") || repeat.equals("Y")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input 1st element: ");
            double a = Double.parseDouble(scanner.nextLine());

            while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Choose operation ( + , - , * , / )");
                operation = scanner.nextLine();
            }
            System.out.println("Input 2nd element: ");
            double b = Double.parseDouble(scanner.nextLine());

            if (operation.equals("+")) {
                double c = plus(a, b);
                showResult(c);
            } else if (operation.equals("-")) {
                double c = minus(a, b);
                showResult(c);
            } else if (operation.equals("*")) {
                double c = multiply(a, b);
                showResult(c);
            } else if (operation.equals("/")) {
                double c = divide(a, b);
                showResult(c);
            } else {
                System.out.println("You didn't choose one of math operations.");
            }
            System.out.println("Repeat once more? YES/NO");
            operation = "";
            repeat = scanner.nextLine();
        }
    }

    static double plus(Double a, Double b) {
        return a+b;
    }

    static double minus(Double a, Double b) {
        return a-b;
    }

    static double multiply(Double a, Double b) {
        return a*b;
    }

    static double divide(Double a, Double b) {
        return a/b;
    }

    public static void showResult(Double i) {
        System.out.println("The result is " + i);
    }
}
