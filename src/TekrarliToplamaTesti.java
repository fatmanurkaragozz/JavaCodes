import java.util.Scanner;

public class TekrarliToplamaTesti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi1 = (int)(Math.random()*10);
        int sayi2 = (int)(Math.random()*10);

        System.out.println(sayi1 + " + " + sayi2 + " =" + " ? ");
        int cevap = input.nextInt();

        while(sayi1 + sayi2 != cevap){
            System.out.println("Yanlış Cevap! Tekrar Deneyiniz!");
            cevap = input.nextInt();
        }
        System.out.println("Doğru cevap, tebrikler!");

        System.out.println("-----------------------");

        int sayi3 = (int)(Math.random()*10);
        int sayi4 = (int)(Math.random()*10);

        System.out.println(sayi1 + " + " + sayi2 + " =" + " ? ");
        int cevap2 = input.nextInt();

        do{
            System.out.println("Yanlış Cevap! Tekrar Deneyiniz!");
            cevap = input.nextInt();
        } while(sayi1 + sayi2 != cevap);

        System.out.println("Doğru cevap, tebrikler!");

    }
}
