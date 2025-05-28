import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int primonumero = scan.nextInt();

        System.out.println("Inserisci un secondo numero");

        int secondonumero = scan.nextInt();

        System.out.println("Inserisci un terzo numero");

        int terzonumero = scan.nextInt();

        if ( primonumero > secondonumero ) {
            if ( primonumero > terzonumero )
                System.out.println(primonumero + " è il più grande dei numeri");
        }else {
            if ( primonumero < secondonumero ) {
                if ( secondonumero > terzonumero ) {
                    System.out.println( secondonumero + " è il più grande dei numeri");
                }else {
                    System.out.println( terzonumero + " è il più grande dei numeri");
                }
            }
        }
    }
}
