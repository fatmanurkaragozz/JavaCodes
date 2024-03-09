public class TabloIndisleriVeIndisToplami {
    public static void main(String[] args) {

        System.out.println("          Tablo Indisleri ve Indis Toplamlari");

        System.out.print("  | ");
        for (int i = 1; i < 10; i++) {
            System.out.print("     " + i);
        }

        System.out.println("\n--|---------------------------------------------------------");

        for (int j = 1; j < 10; j++) {
            System.out.print(j + " | ");
            for(int i = 1; i < 10; i++){
                int toplam = i + j;
                System.out.printf(" " + i + j + "-%2d", i+j);
            }
            System.out.println();
        }


    }
}
