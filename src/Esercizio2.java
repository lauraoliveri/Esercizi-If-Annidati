import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la tua età");

        int eta = scan.nextInt();

        if ( eta > 12 ) {
            if ( eta > 19 ) {
                if ( eta >= 65 ) {
                    System.out.println("Sei un anziano!");
                }else {
                    System.out.println("Sei un adulto");
                }
            }else {
                System.out.println("Sei un adolescente!");
            }
        }else {
            System.out.println("Sei un bambino");
        }
    }
}
