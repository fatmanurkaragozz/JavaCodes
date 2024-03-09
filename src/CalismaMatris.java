import java.util.*;

public class CalismaMatris {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int x = rnd.nextInt(2, 6);
        int y = rnd.nextInt(2, 6);

        int[][] matris = new int[y][x];

        System.out.println("y uzunluğu: " + y + " , x uzunluğu: " + x + " olan matris oluşturuldu.");

        //Matris elemanları kullanıcıdan alınıyor:

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print("Matris değerlerini giriniz: ");
                matris[i][j] = input.nextInt();
            }
        }

        //Matrisi sıralayamadığımızdan önce diziye çevirip ardından sıralayacağız.

        int[] dizi = new int[matris.length * matris[0].length];

        int k = 0;

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {

                dizi[k] = matris[i][j];
                k++;
            }
        }

        // Dizi küçükten büyüğe sıralanıyor:

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {

                if (dizi[j] < dizi[i]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
        // Diziyi matrise aktar.

        int[][] matris2 = new int[y][x];

        int m = 0;

        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[0].length; j++) {

                matris2[i][j] = dizi[m];
                m++;

            }
        }

        //Sıralanmış matris yazdırılıyor...

        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[0].length; j++) {

                System.out.print(matris2[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
