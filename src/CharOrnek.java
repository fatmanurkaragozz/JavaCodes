import java.util.Scanner;

public class CharOrnek {
    public static void main(String[] args) {

        char x = 'a';
        char y = 'c';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);

        // System.out.println(x - y); ifadesi, x'in Unicode
        // değerinden y'nin Unicode değerini çıkarır ve sonucu
        // ekrana yazdırır. x'in değeri 'b' olduğu için Unicode
        // değeri 98'dir ve y'nin değeri 'd' olduğu için Unicode
        // değeri 100'dür. Bu nedenle, 98 - 100 = -2 sonucu ekrana yazdırılır.

        //
        String mesaj = "Merhaba Dünya";
        System.out.print(mesaj.charAt(5));
        System.out.print(mesaj.charAt(4));
        System.out.print(mesaj.charAt(0));
        System.out.print(mesaj.charAt(11));
        System.out.println(mesaj.charAt(12));

        //
        String adSoyad = "Yaman Akbulut";

        String[] adSoyadDizisi = adSoyad.split(" ");

        String ad = adSoyadDizisi[0];
        String soyad = adSoyadDizisi[1];

        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);




    }
}
