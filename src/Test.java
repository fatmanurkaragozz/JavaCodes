import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, max;
        System.out.println("Sayı giriniz: ");
        number = input.nextInt();
        max = number;

        while(number != 0){
            System.out.println("Tekrar sayı giriniz. Sıfır girirseniz sonlanır.");
            number = input.nextInt();
            if(number > max){
                max = number;
            }
        }
        System.out.println("max is " + max);
        System.out.println("number " + number);
    }
}
