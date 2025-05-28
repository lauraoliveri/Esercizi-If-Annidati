import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int numero = scan.nextInt();

        if ( numero > 0 ) {
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }


    }
}
