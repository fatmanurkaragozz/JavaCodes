import java.util.Scanner;

public class MatrisDeneme2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matris = new int[2][4];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.println("Matris değerlerini giriniz: ");
                matris[i][j] = input.nextInt();
            }
        }

        int[] dizi = new int[matris.length * matris[0].length];

        int k = 0;

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {

                dizi[k] = matris[i][j];
                k++;
            }
        }

        System.out.println("Dizi elemanları: ");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {

            }
            System.out.print(dizi[i] + " ");
        }

        System.out.println();
        System.out.println("Büyükten küçüğe sıralma: ");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {

                if (dizi[j] > dizi[i]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");

        }

        System.out.println();
        System.out.println("Matris2: ");

        int[][] matris2 = new int[4][2];

        int x = 0;

        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[0].length; j++) {

                matris2[i][j] = dizi[x];
                x++;
            }
        }

        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[0].length; j++) {
                System.out.print(matris2[i][j] + " ");
            }
        }

    }
}
