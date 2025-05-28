import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        System.out.println("Proviamo a mettere dei numeri in ordine crescente");
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int primonumero = scan.nextInt();

        System.out.println("Inserisci un secondo numero");

        int secondonumero = scan.nextInt();

        System.out.println("Inserisci un terzo numero");

        int terzonumero = scan.nextInt();

        if ( primonumero > secondonumero ) {
            if (primonumero > terzonumero) {
                if (secondonumero > terzonumero) {
                    System.out.println("I numeri sono stati inseriti in ordine crescente.");
                }
            }

        }
    }
}
