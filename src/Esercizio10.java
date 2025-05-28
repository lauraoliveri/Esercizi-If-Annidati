import java.util.Scanner;

public class Esercizio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int numero = scan.nextInt();

        if ( numero % 2 == 0) {
            if ( numero % 5 == 0 ) {
                System.out.println("Numero pari e multiplo di 5");
            } else {
                System.out.println("Numero pari ma NON multiplo di 5");
            }
        } else {
            if ( numero % 5 == 0) {
                System.out.println("Numero dispari e multiplo di 5");
            } else {
                System.out.println("Numero dispari ma NON multiplo di 5");
            }
        }
    }
}
