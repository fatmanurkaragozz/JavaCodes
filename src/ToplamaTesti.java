import java.util.Scanner;

public class ToplamaTesti {
    public static void main(String[] args) {

        int sayi1 = (int) (Math.random() * 100);
        int sayi2 = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.println(sayi1 + " + " + sayi2 + " sonucu nedir? ");
        int cevap = input.nextInt();

        System.out.println(sayi1 + " + " + sayi2 + " = " + cevap + " sonucu "
                + (sayi1 + sayi2 == cevap));

        System.out.println("---------------------");
        /*System.out.println("İç içe if yapıları: ");

        int i = 1, j = 2, k = 3;

        if (i > j) {
            if (i > k) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }*/

    }
}
