import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String primaStringa = sc.nextLine();

        System.out.println("Inserisci il tuo cognome: ");
        String secondaStringa = sc.nextLine();

        System.out.println("Inserisci il tuo soprannome: ");
        String terzaStringa = sc.nextLine();

        String stringheConcatenate = primaStringa + secondaStringa + terzaStringa;
        System.out.println("Stringhe concatenate: " + stringheConcatenate);

        String stringheConcatenateInverso = terzaStringa + secondaStringa + primaStringa;
        System.out.println("Stringhe concatenate inversamente: " + stringheConcatenateInverso);

    }


}
