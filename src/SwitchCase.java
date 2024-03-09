import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok iyi : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
        }

        System.out.println("----------------");

        Scanner input = new Scanner(System.in);

        System.out.println(" Gün için bir sayı giriniz (1-7): ");
        int gun = input.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Bugün günlerden pazartesi");
                break;
            case 2:
                System.out.println("Bugün günlerden salı");
                break;
            case 3:
                System.out.println("Bugün günlerden çarşamba");
                break;
            case 4:
                System.out.println("Bugün günlerden perşembe");
                break;
            case 5:
                System.out.println("Bugün günlerden cuma");
                break;
            case 6:
                System.out.println("Bugün günlerden cumartesi");
                break;
            case 7:
                System.out.println("Bugün günlerden pazar");
                break;
            default:
                System.out.println("Lütfen geçerli bir sayı giriniz");
                System.exit(1);

        }
    }
}
        //System.exit(1) ifadesindeki 1, programın başarısız bir şekilde sonlandırıldığını
        // gösteren bir çıkış kodudur. Ancak, bu değer programın mantığına göre değiştirilebilir.
        // Örneğin, başarısız bir çıkış için farklı bir sayı kullanılabilir veya başarılı bir
        // çıkış durumunda 0 kullanılabilir. Ancak, genellikle başarılı bir çıkış durumunda 0,
        // başarısız bir çıkış durumunda ise farklı bir değer kullanılır.
        //
        //Bu durumda, kullanıcı geçersiz bir sayı girdiğinde programın hemen sonlandırılmasını
        // sağlamak için System.exit(1) kullanılmış.
