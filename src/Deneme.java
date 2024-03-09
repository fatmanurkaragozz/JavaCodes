import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int number, max;

        System.out.println("Sayı giriniz: ");
        number = input.nextInt();
        max = number;

        while(number != 0){
            System.out.println("Sayı giriniz. Sıfır girince sonlanır.");
            number = input.nextInt();
            if(number > max){
                max = number;
            }
        }
        System.out.println("Number is: " + number);
        System.out.println("max: " + max);
    }

}
