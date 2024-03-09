import java.util.Scanner;

public class CıkarmaTesti {
    public static void main(String[] args) {

        int sayi1 = (int) (Math.random() * 100);
        int sayi2 = (int) (Math.random() * 100);
        int sonuc;

        if (sayi2 > sayi1) {
            sonuc = sayi2 - sayi1;
        } else {
            sonuc = sayi1 - sayi2;
        }

        Scanner input = new Scanner(System.in);
        System.out.println(sayi1 + " - " + sayi2 + " İşlemin sonucu nedir?");
        int cevap = input.nextInt();

        System.out.println("Sayıların farkı: " + sonuc + "  " + (cevap == sonuc));

        System.out.println("---------------------------");

        int sayi3 = (int) (Math.random() * 10);
        int sayi4 = (int) (Math.random() * 10);

        if (sayi3 < sayi4) { // ******5


            int temp = sayi3;
            sayi3 = sayi4;
            sayi4 = temp;
        }
        System.out.println(sayi3 + " - " + sayi4 + " nedir? ");
        int cevap2 = input.nextInt();

        if (sayi3 - sayi4 == cevap2) {
            System.out.println("Sonuç doğru, tebrikler! ");
        } else {
            System.out.println("Cevabın yanlış! ");
            System.out.println(sayi3 + " - " + sayi4 + " sonucu " + (sayi3 - sayi4) + " olmalı.");
        }


    }
}
