public class CarpimTablosu {
    public static void main(String[] args) {

        System.out.println("              Çarpım Tablosu");

        System.out.print("   ");
        for (int j = 1; j < 10; j++) {
            System.out.print("   " + j);
        }
        System.out.println("\n------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
// 'printf' yöntemiyle, her bir çarpım sonucu 4 karakterlik
// bir alan kaplayacak şekilde biçimlendirilir.