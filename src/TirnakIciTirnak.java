import java.util.Scanner;

public class TirnakIciTirnak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String passwd = "Yazilim2024";

        System.out.println("Kullanıcı şifresi giriniz: ");
        String giris = input.nextLine();

        int i = 0;
        while (!passwd.equals(giris)) {

            System.out.println("Sifre yanlıs, tekrar giriniz: ");
            giris = input.nextLine();
            i++;

            if (i == 4) {
                System.out.println("Program sonlaniyor...");
                break;

            }
        }
        if (passwd.equals(giris)) {
            System.out.println("Hos geldiniz!");
        }

    }
}