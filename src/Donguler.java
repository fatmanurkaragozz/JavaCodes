import java.util.Scanner;

public class Donguler {
    public static void main(String[] args) {

        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Döngüsü Bitti");

        //
        int sayac = 1;
        while (sayac <= 100) {
            System.out.println("Merhaba Dünya");
            sayac++;
        }

        //
        int top = 0, i=1;
        while (i<11){
            top += i;
            i++;
            System.out.println("Sayıların  toplamı: " + top );
        }

        // Tekrarlı Toplama Testi

        int sayi1 = (int)(Math.random() * 10);
        int sayi2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.println(sayi1 + " + " + sayi2 + " = " + "?");
        int cevap = input.nextInt();

        while(sayi1 + sayi2 != cevap){
            System.out.println("Cevabınız yanlış, tekrar deneyiniz! ");
            cevap = input.nextInt();
        }
        System.out.println("Cevabınız doğru tebrikler. ");

        // Sayı tahmini

        int sayi3 = (int)(Math.random() * 100);

        int tahmin = -1;

        while(tahmin != sayi3){
            System.out.println("0 ile 100 arasında bir sayı tahmin ediniz. ");
            tahmin = input.nextInt();

            if(tahmin==sayi3){
                System.out.println("Evet, sayi: " + sayi3);
            }else if(tahmin > sayi3){
                System.out.println("Tahmininiz büyük! ");
            }else{
                System.out.println("Tahmininiz düşük! ");
            }
        }

        // Gözcü değer: sıfır girildiğinde döngü sonlanır.

        int toplam = 0;
        System.out.println("Değer girniz: ");
        int veri = input.nextInt();

        while(veri!=0){
            toplam += veri;
            System.out.println("Girmeye devam ediniz , 0 girilirse giriş sonlanır! ");
            veri = input.nextInt();
        }
        System.out.println("Toplam: " + toplam);

        // Gözcü değer 2:

        int toplamm = 0;
        int verii;

        do {
            System.out.println("Değer giriniz: ");
            verii = input.nextInt();
            toplamm += verii;
            System.out.println("Girmeye devam ediniz, 0 girilirse giriş sonlanır! ");
        }while( verii != 0);

        System.out.println("Toplam: " + toplamm);

    }
}
