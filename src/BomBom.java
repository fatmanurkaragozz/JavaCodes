import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BomBom {
    public static void main(String[] args) {
        // Oyun tablosunu temsil eden iki boyutlu Char dizisi
        char[][] tablo = new char[10][10];
        try (BufferedReader reader = new BufferedReader(new FileReader("src/harita.txt")))
        {
            String satir;
            // Satır satır okuma işlemi yapılır
            for (int i = 0; i < 10 && (satir = reader.readLine()) != null; i++) {
                // Her satırdaki sayıları boşluklarla ayırarak diziye aktarır
                char[] satirDizi = satir.toCharArray();

                // Her sayıyı matrise atar
                for (int j = 0; j < 10 && j < satirDizi.length; j++) {
                    tablo[i][j] = satirDizi[j];
                }
            }
        }
        catch (IOException e) {
            System.out.println("Dosya okuma hatası: ");
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Dosyadaki sayıları çevirme hatası.");
            e.printStackTrace();
        }
        // Kullanıcıdan giriş almak için bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Iyun devam ettiği sürece kullanıcıdan girişleri al
        while (true) {
            // Oyun tablosunu renkli bir şekilde yazdır
            renkliTabloyuYazdir(tablo);

            //Kullanıcıdan koordinat girişi alın
            System.out.print("Koordinatları girin (örnek: 4 5): ");
            String input = scanner.nextLine();

            if (input.equals("0 0")) {
                System.out.println("Oyun sona erdi.");
                break;
            }
            // 'equals' metodu, karşılaştırılan iki dzinin (veya stringin) karakter içeriğinin
            // aynı olup olmadığını kontrol eder. Eğer kullanıcı "0 0" girdisini yaparsa, oyun
            // sona erer ve döngüden çıkılır.

            // Girişi parçalayarak satır ve sütun koordinatlarını alın
            String[] koordinatlar = input.split(" ");
            int satir = Integer.parseInt(koordinatlar[0]) - 1;
            int sutun = Integer.parseInt(koordinatlar[1]) - 1;

            // 'split' metodu, bir dizideki karakterleri belirli bir ayırıcıya göre böler ve
            // elde edilen parçaları bir diziye yerleştirir. Kullanıcıdan alınan girişi parçalamak
            // ve böylece satır ve sütun koordinatlarını elde etmek amacıyla kullanılmıştır.
            // Örneğin kullanıcı "4 5" şeklinde bir giriş yaptığında, bu giriş boşluk karakterine göre
            // parçalanarak "4" ve "5" şeklinde iki elemanlı bir dizi elde edilir.

            // 'parseInt' metodu, bir sayısal dizeyi tam sayıya dönüştürür. Kullanıcıdan alınan girişin
            // sayısal değerlere dönüştürülmesi için kullanılır. 'split' metodu ile elde edilen dizi
            // elemanları, 'parseInt' kullanılarak tam sayıya dönüştürülür. Bu sayede, oyun tablosunda
            // belirli bir hücreye ulaşmak için kullanılacak satır ve sütun elde edilir. Örrneğin
            // 'parseInt("4")' ifadesi 4 sayısını üretir.

            // Seçilen koordinatları işle
            genelKontrol(tablo, satir, sutun);
            tablo[satir][sutun] = 'X'; // Seçilen koordinatı 'X' yap
        }
    }

    // Verilen bir koordinat üzerinde genel bir kontrol gerçekleştirme metodu
    public static void genelKontrol(char[][] tablo, int satir, int sutun) {
        final char secim = tablo[satir][sutun];

        asagiKontrol(tablo, satir, sutun, secim);
        sagKontrol(tablo, satir, sutun, secim);
        solKontrol(tablo, satir, sutun, secim);
        yukariKontrol(tablo, satir, sutun, secim);
    }

    public static void sagKontrol(char[][] tablo, int satir, int sutun, char secim) {
        if (sutun < 9 && secim == tablo[satir][sutun + 1] && tablo[satir][sutun + 1] != 'X') {
            sagKontroller(tablo, satir, sutun + 1);
            tablo[satir][sutun + 1] = 'X';

            // sutun < 9: Bu koşul, belirli bir hücrenin sağında başka bir hücre olduğunu kontrol eder.
            // Eğer sutun değeri 9'dan küçükse, hücrenin sağında başka bir hücre vardır ve bu durumu
            // kontrol etmek istiyoruz.

        }
    }


    public static void solKontrol(char[][] tablo, int satir, int sutun, char secim) {
        if (sutun > 0 && secim == tablo[satir][sutun - 1] && tablo[satir][sutun - 1] != 'X') {
            solKontroller(tablo, satir, sutun - 1);
            tablo[satir][sutun - 1] = 'X';

            // sutun > 0: Bu koşul, belirli bir hücrenin solunda başka bir hücre olduğunu kontrol eder.
            // Eğer sutun değeri 0'dan büyükse, hücrenin solunda başka bir hücre vardır ve bu durumu
            // kontrol etmek istiyoruz.

        }
    }

    public static void yukariKontrol(char[][] tablo, int satir, int sutun, char secim) {
        if (satir > 0 && secim == tablo[satir - 1][sutun] && tablo[satir - 1][sutun] != 'X') {
            yukariKontroller(tablo, satir - 1, sutun);
            tablo[satir - 1][sutun] = 'X';

            // satir > 0: Bu koşul, belirli bir hücrenin üstünde başka bir hücre olduğunu kontrol eder.
            // Eğer satir değeri 0'dan büyükse, hücrenin üstünde başka bir hücre vardır ve bu durumu
            // kontrol etmek istiyoruz.

        }
    }

    public static void asagiKontrol(char[][] tablo, int satir, int sutun, char secim) {
        if (satir < 9 && secim == tablo[satir + 1][sutun] && tablo[satir + 1][sutun] != 'X') {
            asagiKontroller(tablo, satir + 1, sutun);
            tablo[satir + 1][sutun] = 'X';

            // satir < 9: Bu koşul, belirli bir hücrenin altında başka bir hücre olduğunu kontrol eder.
            // Eğer satir değeri 9'dan küçükse, hücrenin altında başka bir hücre vardır ve bu durumu
            // kontrol etmek istiyoruz.

        }
    }

    public static void sagKontroller(char[][] tablo, int satir, int sutun) {
        sagKontrol(tablo, satir, sutun, tablo[satir][sutun]);
        yukariKontrol(tablo, satir, sutun, tablo[satir][sutun]);
        asagiKontrol(tablo, satir, sutun, tablo[satir][sutun]);
    }

    public static void solKontroller(char[][] tablo, int satir, int sutun) {
        solKontrol(tablo, satir, sutun, tablo[satir][sutun]);
        yukariKontrol(tablo, satir, sutun, tablo[satir][sutun]);
        asagiKontrol(tablo, satir, sutun, tablo[satir][sutun]);
    }

    public static void yukariKontroller(char[][] tablo, int satir, int sutun) {
        yukariKontrol(tablo, satir, sutun, tablo[satir][sutun]);
        sagKontrol(tablo, satir, sutun, tablo[satir][sutun]);
        solKontrol(tablo, satir, sutun, tablo[satir][sutun]);
    }

    public static void asagiKontroller(char[][] tablo, int satir, int sutun) {
        asagiKontrol(tablo, satir, sutun, tablo[satir][sutun]);
        sagKontrol(tablo, satir, sutun, tablo[satir][sutun]);
        solKontrol(tablo, satir, sutun, tablo[satir][sutun]);
    }

    // sagKontroller solKontroller yukarıKontroller asagiKontroller ile birlikte girilen
    // konumun etrafındaki rakamların ilerisinin kontrol dilmesi sağlanır

    public static void renkliTabloyuYazdir(char[][] tablo) {
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j] == 'X') {
                    System.out.print("\u001B[31m" + tablo[i][j] + " \u001B[0m");
                } else {
                    System.out.print(tablo[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Dıştaki döngü (for (int i = 0; i < tablo.length; i++)): Bu döngü, tablo dizisinin
    //satırlarını temsil eder. tablo.length ifadesi, tablo dizisinin kaç satırdan oluştuğunu verir.

    //İçteki döngü (for (int j = 0; j < tablo[i].length; j++)): Bu döngü, her bir satırdaki sütunları
    //temsil eder. tablo[i].length ifadesi, tablo dizisinin bir satırındaki sütun sayısını verir.

    //Döngülerin içindeki if-else bloğu, her bir hücrenin değerine göre işlem yapar:

    //Eğer hücrenin değeri 'X' ise, bu durumda hücre kırmızı renkte yazdırılır
    //(System.out.print("\u001B[31m" + tablo[i][j] + " \u001B[0m");). Bu, kırmızı renkte bir "X"
    //karakterini ifade eder. ANSI renk kodları kullanılarak renklendirme yapılır.

    //Eğer hücrenin değeri 'X' değilse, bu durumda hücre normal renkte yazdırılır
    //(System.out.print(tablo[i][j] + " ");).

    //Her bir satırın sonunda System.out.println(); ifadesi kullanılarak bir alt satıra geçilir,
    //böylece tablonun düzgün bir şekilde ekrana yazdırılması sağlanır. Bu işlem, tablonun her bir
    // satırını ayrı bir satırda ekrana basmak için gereklidir.

}