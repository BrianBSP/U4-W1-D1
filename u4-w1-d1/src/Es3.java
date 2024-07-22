import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("------ Perimetro Rettangolo ------");
        System.out.println("Lati del rettangolo");

        double num1 = Double.parseDouble(sc.nextLine());
        double num2 = Double.parseDouble(sc.nextLine());

        double risultatoPerimetro = perimetroRettangolo(num1, num2);
        System.out.println("Perimetro del rettangolo: " + risultatoPerimetro);
        System.out.println("------ Pari o Dispari ------");
        double num3 = Double.parseDouble(sc.nextLine());

        double risultatoPariDispari = pariDispari(num3);
        if (risultatoPariDispari == 0) {
            System.out.println("Il numero è PARI");
        } else {
            System.out.println("Il numero è DISPARI");
        }
        System.out.println("------ Area Triangolo -------");
        double l1 = Double.parseDouble(sc.nextLine());
        double l2 = Double.parseDouble(sc.nextLine());
        double l3 = Double.parseDouble(sc.nextLine());

        double risultatoArea = areaTriangolo(l1, l2, l3);
        System.out.println("L'area del triangolo è: " + risultatoArea);

    }

    public static double perimetroRettangolo(double num1, double num2) {
        return (num1 * 2) + (num2 * 2);
    }

    public static double pariDispari(double num) {
        return num % 2;
    }

    public static double areaTriangolo(double l1, double l2, double l3) {
        double p = (l1 + l2 + l3) / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }
}
