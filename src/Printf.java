public class Printf {
    public static void main(String[] args) {

        double miktar = 12618.98;
        double ucretOrani = 0.0013;
        double ucret = miktar * ucretOrani;
        System.out.println("Ücret: " + ucret + "TL");

        double miktar2 = 12618.98;
        double ucretOrani2 = 0.0013;
        double ucret2 = miktar2 * ucretOrani2;
        System.out.println("Ücret: " + (int)(ucret2 * 100)/100.0 + "TL");

        double miktar3 = 12618.98;
        double ucretOrani3 = 0.0013;
        double ucret3 = miktar * ucretOrani;
        System.out.printf("Ücret: %5.3f TL", ucret3);

        int adet = 5;
        double miktarr = 45.56;
        System.out.printf(" Adet %d ve miktar %f", adet, miktarr);

        //'Adet %d ve miktar %f' biçimli bir dizi belirtilir. Burada '%d' ve '%f'
        // yer tutucuları, sırasıyla bir tamsayı ve ondalık sayı için yer tutucuları
        // olarak kullanılır. 'printf' yöntemi, bu biçimli dizeyi kullanarak çıktı
        // oluşturur. Yer tutucular, belirtilen değişkenlerin değeriyle değiştirilir.
        // '%d' yer tutucusu, 'adet' değişkeninin değeri ile, '%f' yer tutucusu ise
        // 'miktarr' değişkeninin değeri ile değiştirilir. Yer tutucuların yerine geçen
        // değerler, belirtilen biçimlendirme kurallarına uygun olarak diziye dönüştürülür
        // ve çıktı olarak ekrana yazdırılır.


    }
}
