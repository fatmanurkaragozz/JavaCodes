import java.util.Scanner;

public class KokHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("a değerini giriniz: ");
        int a = input.nextInt();
        System.out.println("b değerini giriniz: ");
        int b = input.nextInt();
        System.out.println("c değerini giriniz: ");
        int c = input.nextInt();

        int delta = b * b - 4 * a * c;

        if (delta > 0) {
            double kok1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
            double kok2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
            System.out.println("Denklemin iki kökü vardır, bunlar: " + kok1 + " , " + kok2);
        } else if (delta == 0) {
            double kok3 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
            System.out.println("Denklemin tek kökü vardır: " + kok3);
        } else {
            System.out.println("Denklemin kökü yoktur.");
        }
    }
}
