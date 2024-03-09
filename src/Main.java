import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1 = 453;
        int sayi2 = 987;
        int sayi3 = 231;
        int enBuyuk = sayi1;

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 > sayi3) {
                System.out.println("sayi1 > sayi2 > sayi3");
            } else {
                System.out.println("sayi1 > sayi3 > ssayi2");
            }
        }
        if (sayi2 > sayi1 && sayi2 > sayi3) {
            if (sayi1 > sayi3) {
                System.out.println("sayi2 > sayi1 > sayi3");
            } else {
                System.out.println("sayi2 > sayi3 > sayi1");
            }
        }
        if (sayi3 > sayi1 && sayi3 > sayi2) {
            if (sayi1 > sayi2) {
                System.out.println("sayi3 > sayi1 > sayi2");
            } else {
                System.out.println("sayi3 > sayi2 > sayi1");
            }
        }

        System.out.println("---------------------------------");

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayı: " + enBuyuk);

        System.out.println("--------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if(sayi % 2 == 0 && sayi % 3 == 0){
            System.out.println(sayi + " sayısı 2 VE 3'e bölünebilir. ");
        }
        if(sayi % 2 == 0 || sayi % 3 == 0){
            System.out.println(sayi + " sayısı 2 VEYA 3'e bölünebilir. ");
        }
        if(sayi % 2 == 0 ^ sayi % 3 == 0){
            System.out.println(sayi + " sayısı 2 VEYA 3'e bölünebilir, "
                    + "her ikisine bölünemez. ");
        }
        if(sayi % 2 != 0 || sayi % 3 != 0){
            System.out.println(sayi + " sayısı 2'ye de 3'e de bölünemez. ");
        }



    }

}
