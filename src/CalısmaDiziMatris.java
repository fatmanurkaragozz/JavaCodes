import java.util.*;

public class CalısmaDiziMatris {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Oluşturmak istediğiniz dizi uzunluğu nedir? :");
        int uzunluk = input.nextInt();

        int dizi[] = new int[uzunluk];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(15, 36);
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {

                if (dizi[j] < dizi[i]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
        System.out.println("Küçükten büyüğe yazdırılıyor: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "  ");
        }

        int max = dizi[0];
        int maxIndex = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > dizi[0]) ;
            max = dizi[i];
            maxIndex = i;
        }
        System.out.println();
        System.out.println("Max dizi değeri: " + max);
        System.out.println("Max indeksimiz: " + maxIndex);

        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        System.out.print("Dizi elemanlarının toplamı: " + toplam);

    }
}
