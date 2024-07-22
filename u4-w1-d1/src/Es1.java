import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {

        System.out.println("------ Esercizio 1 --------");

        System.out.println("Metodo Moltiplica");
        int result = moltiplica(2, 3);
        System.out.println("Il prodotto della moltiplicazione è: " + result);
        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.println("Metodo Concatena");
        String laMiaStringa = "Ciao mamma guarda come mi diverto...";
        int ilMioNumero = 10;
        String resultConcat = concatena(laMiaStringa, ilMioNumero);
        System.out.println(resultConcat);

        System.out.println("Metodo inseriscInArray");
        String[] mioArray = {"uno", "due", "quatto", "cinque", "sei"};
        String nuovaStringa = "tre";

        String[] risultatoArray = inserisciInArray(mioArray, nuovaStringa);

        for (String element : risultatoArray) {
            System.out.println(element);
        }

    }

    public static int moltiplica(int num1, int num2) {

        return num1 * num2;
    }

    public static String concatena(String ciao, int num3) {

        return ciao + num3;
    }

    public static String[] inserisciInArray(String[] ilMioArray, String altraStringa) {

        //String[] mioArray = new String[5];
        //String[] mioArray = {"uno", "due", "quatto", "cinque", "sei"};


        String[] nuovoArray = new String[6];

        for (int i = 0; i < 2; i++) {
            nuovoArray[i] = ilMioArray[i];
        }

        nuovoArray[2] = altraStringa;

        nuovoArray[3] = ilMioArray[2];
        nuovoArray[4] = ilMioArray[3];
        nuovoArray[5] = ilMioArray[4];


        return nuovoArray;
    }
}
