import java.util.Scanner;

public class MatrisOrnekleri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matris1 = new int[2][4];

        //elemanları kullanıcıdan alınarak bir matris oluşturuluyor
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                System.out.println("Matris değerini giriniz: ");
                matris1[i][j] = input.nextInt();
            }
        }

        //oluşturulan matris bir diziye aktarılıyor // matris.length: satır, matris[0].length: sütun.
        int[] dizi1 = new int[matris1.length * matris1[0].length];

        int k = 0;

        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {

                dizi1[k] = matris1[i][j];
                k++;

            }
        }

        //-------------------------------------------------------------------------

        // Büyükten küçüğe sıralama : dizi sıalanır, matris değil !
        for (int i = 0; i < dizi1.length; i++) {
            for (int j = i + 1; j < dizi1.length; j++) {

                if (dizi1[j] > dizi1[i]) {
                    int temp = dizi1[i];
                    dizi1[i] = dizi1[j];
                    dizi1[j] = temp;
                }
            }
        }

        // yeni bir matris oluşturuyoruz. Matris2 adında olur...
        int[][] matris2 = new int[4][2];

        int m = 0;

        // Bu matris2 'nin içine sıralı diziyi aktarıyoruz.
        // Diziyi matrise aktarıyoruz yani.
        for (int a = 0; a < matris2.length; a++) {
            for (int b = 0; b < matris2[0].length; b++) {

                matris2[a][b] = dizi1[m];
                m++;

            }
        }

        //matris2 yazdırılıyor...

        System.out.println("Matris2: ");

        for (int a = 0; a < matris2.length; a++) {
            for (int b = 0; b < matris2[0].length; b++) {
                System.out.print(matris2[a][b] + " ");
            }
            System.out.println();
        }


        // bu diziyi matris2 isimli bir matrise aktaracağız ardından matris2
        // isimli matrisi ekrana alt alta tablo görnümünde yazdır (matris2 4*2 boyutunda olacak)


    }
}
