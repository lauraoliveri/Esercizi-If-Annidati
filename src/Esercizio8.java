import java.util.Scanner;

public class Esercizio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero pari, positivo e minore di 100");

        int numero = scan.nextInt();

        if ( numero % 2 == 0) {
            if (numero > 0 ) {
                if (numero < 100 ) {
                    System.out.println("Il numero soddisfa le condizioni");
                } else {
                    System.out.println("Il numero NON soddisfa le condizioni");
                }
            } else {
                System.out.println("Il numero NON soddisfa le condizioni");
            }
        } else {
            System.out.println("Il numero NON soddisfa le condizioni");
        }
    }
}
