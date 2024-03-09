public class IciceDonguler {
    public static void main(String[] args) {

        // Carpım Tablosu
        // tablonun başlığı
        System.out.println("           Çarpım Tablosu");

        // sayı başlığı
        System.out.print("    ");
        for (int j = 1; j < 10; j++) {
            System.out.print("   " + j);
        }
        System.out.println("\n----------------------------------------");

        // tablonun gövdesi
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j < 10; j++) {
                // çarpımlar ve düzenli yerleştirme
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        // Carpım Tablosu İndis

        System.out.println("                   Çarpım Tablosu İndisleri");

        System.out.print("   ");
        for (int b = 1; b < 10; b++) {
            System.out.print("  " + b);
        }
        System.out.println("\n------------------------------");

        for (int a = 1; a < 10; a++) {
            System.out.print(a + " | ");
            for (int b = 1; b < 10; b++) {
                System.out.printf(" %d%d", a, b);
            }
            System.out.println();
        }

    }
}
