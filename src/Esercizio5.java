import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
        System.out.println("Determiniamo il tipo di triangolo");
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int primolato = scan.nextInt();

        System.out.println("Inserisci un secondo numero");

        int secondolato = scan.nextInt();

        System.out.println("Inserisci un terzo numero");

        int terzolato = scan.nextInt();

        if ( primolato == secondolato ) {
            if ( primolato == terzolato ) {
                System.out.println("Il triangolo è di tipo equilatero");
            } else {
                System.out.println("Il triangolo è di tipo isoscele");
            }
        }else {
            if ( primolato == terzolato ) {
                System.out.println("Il triangolo è di tipo isoscele");
            }else {
                System.out.println("Il triangolo è di tipo scaleno");
            }
        }
    }
}
