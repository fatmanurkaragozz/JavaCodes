import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi =(int)(Math.random()*100);

        System.out.println("Sayıyı tahmin ediniz: ");
        int tahmin = input.nextInt();

        while(tahmin != sayi) {
            if (tahmin > sayi) {
                System.out.println("Fazla tahmin ettiniz.");
                tahmin = input.nextInt();
            } else if (tahmin < sayi) {
                System.out.println("Düşük tahmin ettiniz.");
                tahmin = input.nextInt();
            }
        }
        System.out.println("Sayı: " + sayi + " Doğru cevap tebrikler!");

        // do while ile deneyelim
        int sayii,tahminn;
        sayii = (int)(Math.random() * 100);

        do{
            System.out.println("Sayıyı tahmin ediniz: ");
            tahminn = input.nextInt();

            if(tahminn > sayii){
                System.out.println("Fazla tahmin ettiniz.");
            }else if(tahminn < sayii){
                System.out.println("Düşük tahmin ettiniz. ");
            }
        }while(tahminn != sayii);

        System.out.println("Sayı: " + sayii + " Doğru cevap tebrikler!");


    }
}
