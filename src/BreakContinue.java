public class BreakContinue {
    public static void main(String[] args) {

        // Break Testi
        int top = 0;
        int sayi = 0;

        while (sayi < 20) {
            sayi++;
            top += sayi;
            if (top >= 100) {
                break;
            }
        }
        System.out.println("Sayi: " + sayi);
        System.out.println("Top: " + top);

        //Continue Testi
        int topp= 0;
        int sayi2 = 0;

        while(sayi2 < 20){
            sayi2++;
            topp += sayi2;
            if(sayi2 == 10 || sayi2 == 11){
                continue;
            }
            System.out.println("Sayi: " + sayi2);
            System.out.println("Top: " + topp);
        }


    }
}
