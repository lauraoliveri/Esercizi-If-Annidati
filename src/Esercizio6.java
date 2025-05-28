import java.util.Scanner;

public class Esercizio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un anno");

        int anno = scan.nextInt();

        if ( anno % 4 == 0) {
            if (anno % 400 == 0) {
                if (anno % 100 == 0) {
                    System.out.println("Anno bisestile");
                } else {
                    System.out.println("Anno non bisestile");
                }
            } else {
                if (anno % 100 == 0 ) {
                    System.out.println("Anno non bisestile");
                }
                else {
                    System.out.println("Anno bisestile");
                }
            }
        } else {
            System.out.println("Anno non bisestile");
        }
    }
}
