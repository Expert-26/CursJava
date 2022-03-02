package md.curs.primalectie;

public class ArithmeticClass {

        public static void main(String[] args) {
            int friends = 10;
            System.out.println("Friends = " + friends);

            friends = friends % 4;//restul impartirii
            System.out.println("Friends = " + friends);

            friends++; // friends = friends + 1
            System.out.println("Friends = " + friends);

            friends--; // friends = friends - 1
            System.out.println("Friends = " + friends);


            int max = Math.max(2, 4);
            System.out.println("Maximum este " + max);
            double d = Math.min(10.5, 5.12);
            System.out.println("Minimum este " + d);

            int modul = Math.abs(-8);
            System.out.println(modul);

            double r = Math.sqrt(25);
            System.out.println(r);

            double randomNumber = Math.floor( Math.random() * 100 );
            System.out.println("randomNumber is : " + randomNumber);

        }

    }

