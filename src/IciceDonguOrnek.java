public class IciceDonguOrnek {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            int j = 0;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }

        for (int a = 4; a > 0; a--) {
            int b = 0;
            while (b < a) {
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }

        int c = 0;
        while (c < 5) {
            for (int d = c; d > 1; d--) {
                System.out.print(d + "***");
            }
            System.out.println("-" + c + "-");
            c++;
        }




    }
}
