import java.util.Scanner;

public class EnBuyukOrtakBolen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 0;
        int k = 2;

        while (k <= sayi1 && k <= sayi2) {
            if (sayi1 % k == 0 && sayi2 % k == 0) {
                ebob = k;
            }
            k++;

        }
        System.out.println(sayi1 + " ve " + sayi2 + " için " + "En büyük ortak bölen: " + ebob);

    }
}
