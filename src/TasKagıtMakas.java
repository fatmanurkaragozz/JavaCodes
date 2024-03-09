import java.util.*;

public class TasKagıtMakas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int tas = 0;
        int kagıt = 1;
        int makas = 2;

        System.out.println("Taş, kağıt, makas hangisi ? (Taş için 0' ı, kağıt için 1'i" +
                "ve makas için 2'yi girin) ");
        int benimSecimim = input.nextInt();

        int pcSecimi = (int) (Math.random() * 3);
        System.out.println("Bilgisayarın secimi: " + pcSecimi);

        if (benimSecimim == 0 && pcSecimi == 2 || benimSecimim == 1 && pcSecimi == 0 || benimSecimim == 2 && pcSecimi == 1) {
            System.out.println("Siz kazandınız!");
        } else if (benimSecimim == pcSecimi) {
            System.out.println(" Berabere! ");
        } else {
            System.out.println(" Bilgisayar kazandı! ");
        }

        System.out.println("-----------------------");

        String[] nesneler = {"Tas", "Kagit", "Makas"};
        int prg = (int) (Math.random() * 3);

        System.out.println("Tas:0, Kagit:1, Makas:2 Hangisi? ");
        int sen = input.nextInt();

        System.out.println("Program: " + nesneler[prg]);
        System.out.println("Sen: " + nesneler[sen]);

        if (prg == 0 && sen == 1 || prg == 1 && sen == 2 || prg == 2 && sen == 1) {
            System.out.println("Kazandın!");
        } else if (prg == sen) {
            System.out.println("Berabere");
        } else {
            System.out.println("Kaybettin! ");
        }

    }
}
