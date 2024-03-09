public class DiziSiralama {
    public static void main(String[] args) {

        int[] dizi = new int[4];

        dizi[0] = 11;
        dizi[1] = 7;
        dizi[2] = 99;
        dizi[3] = 81;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {

                if (dizi[j] > dizi[i]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
        System.out.println("Büyükten küçüğe sıralama: ");

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "  ");
        }

        System.out.println();

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {

                if (dizi[j] < dizi[i]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;

                }
            }
        }
        System.out.println("Küçükten büyüğe sıralama: ");

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "  ");
        }

        System.out.println();

        int max = dizi[0];
        int min = dizi[0];

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] > max) {
                max = dizi[i];

            }

            if (dizi[i] < min) {
                min = dizi[i];
            }
        }
        System.out.println("Dizinin en büyük elemanı: " + max);
        System.out.println("Dizinin en küçük elemanı: " + min);

    }
}
