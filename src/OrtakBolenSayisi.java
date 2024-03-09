import java.util.Scanner;

public class OrtakBolenSayisi {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        System.out.print("İki tam sayi giriniz: ");
        int sayi1 = giris.nextInt();
        int sayi2 = giris.nextInt();

        int k = 2;
        int obs = 0;

        while (k <= sayi1 && k <= sayi2) {
            if (sayi1 % k == 0 && sayi2 % k == 0) {
                System.out.println(k);
                obs++;
            }
            k++;
            }
        System.out.println("Ortak bolen sayisi: " + obs);
        }
    }
