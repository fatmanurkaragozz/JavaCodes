import java.util.Scanner;

public class Length {
    public static void main(String[] args) {

        String mesaj = "Saklanir Nisan";
        System.out.println(mesaj + " mesajının uzunluğu " + mesaj.length() + " dir. ");

        String mesaj2 = "";
        System.out.println(mesaj2 + " mesajının uzunluğu " + mesaj2.length() + " dir. ");

        // concat
        String s1 = "İnsan düşünmüyor değil.";
        String s2 = " Hiç üzülmüyor değil.";

        String s3 = s1.concat(s2);
        System.out.println(s3);

        //
        int i = 2, j = 3;
        System.out.println( "i + j " + i + j);

        int a = 7, b = 8;
        System.out.println("a + b " + (a+b));

        //
        System.out.println("Merhaba".toLowerCase());
        System.out.println("Merhaba".toUpperCase());

        System.out.println("\t         İyi Akşamlar        \n".trim());

        //String tüm satır
        Scanner input = new Scanner(System.in);
        System.out.println("Bir satır yazınız: ");
        String s = input.nextLine();
        System.out.println("Girilen satir: " + s);
        char ch = s.charAt(4);
        System.out.println("Girilen karakter " + ch);

        //
        String f1 = "Merhaba Dunya";
        String f2 = "Merhaba Dunya";
        String f3 = "Merhaba Mars";
        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(f3));
        System.out.println(f1.compareTo(f2));
        // f1 dizisi, f2 dizisinden büyükse sıfırdan büyük bir sayı, küçükse
        // sıfırdan küçük bir sayı döndürür.

        System.out.println(f1.startsWith("Me"));
        System.out.println(f1.startsWith("me"));

        System.out.println(f1.endsWith("ya"));
        System.out.println(f1.endsWith("y"));

        System.out.println(f1.contains("Du"));
        System.out.println(f1.contains("du"));

        //
        System.out.println("İlk şehri yazınız: ");
        String sehir1 = input.nextLine();
        System.out.println("İkinci şehri yazınız: ");
        String sehir2 = input.nextLine();

        if (sehir1.compareTo(sehir2) < 0){
            System.out.println("Şehirlerin alfabetik sırası: " + sehir1 + " , " + sehir2);
        }else{
            System.out.println("Şehirlerin alfabetik sırası: " + sehir2 + " , " + sehir1);
        }
    }
}
