import java.util.Scanner;

public class Charlar {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(++ch);

        char chh = (char)0XAB0041;
        System.out.println(chh);

        char cch = (char)65.25;
        System.out.println(cch);

        int i = (int)'A';
        System.out.println(i);

        byte c = 'd';  //c nin unicode değeri 99 , d ninki 100.
        int j = 'd';   //bu kısım açık çevirme
        System.out.println(j);

        byte f =(byte)'\uFFF4';
        System.out.println(f);

        int k = '2' + '3';              //(int)'2', 50 ve (int)'3', 51 eder.
        System.out.println("k: " + k);  //i:101

        int l = 2 + 'a';                //(int)'a', 97 eder.
        System.out.println("l: " + l);

        System.out.println(l + " , " + (char)l + " nin Unicode karakteridir.");

        System.out.println("Chapter " + '2');

        System.out.println( 'a' < 'b'); //'a' nın (97) Unicode değeri, 'b' nin Unicode (98) değerinden küçüktür.
        System.out.println( 'a' < 'A'); //'a' nın (97) Unicode değeri, 'A' nın Unicode (65) değerinden büyüktür.
        System.out.println( '1' < '8'); //'1' in (49) Unicode değeri, '8' in Unicode (56) değeriden küçüktür.

        Scanner input = new Scanner(System.in);

        System.out.println("Bir karakter giriniz: ");
        char krt = input.next().charAt(0);

        if(krt >= 'A' && krt <= 'Z'){
            System.out.println(krt + "karakterleri büyük harftir");
        }else if(krt >= 'a' && krt <= 'z'){
            System.out.println(krt + " karakterleri küçük harftir");
        }else if(krt >= '0' && krt <= '9'){
            System.out.println(krt + "sayısaal karakterdir");
        }
    }
}
