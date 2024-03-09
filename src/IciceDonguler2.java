public class IciceDonguler2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i * j);
            }
        }
        //Dıştaki döngü (i döngüsü):

        //i değişkeni 0'dan başlayarak 10'a kadar (10 hariç) her bir sayıyı dolaşır.
        //Her bir döngü adımında, içteki döngü başlatılır.
        //İçteki döngü (j döngüsü):

        //j değişkeni 0'dan başlayarak i'ye kadar (ancak i dahil değil) her bir sayıyı dolaşır.
        //İçteki döngü, dıştaki döngünün değişkeni olan i'ye bağlı olduğu için, her bir dış döngü adımında farklı bir aralıkta çalışır.
        //İçteki döngünün koşulu j < i olduğu için, her bir iç döngü adımında j, i'den küçük olduğu sürece çalışır.
        //Her iç döngü adımında, i * j işlemi gerçekleştirilir ve sonuç ekrana yazdırılır.

        // Bu işlem, her bir iç döngü adımında i ve j değerlerinin çarpımını hesaplar.
        //Ancak, bu sonuçlar her bir iç döngü adımında ayrı bir satıra yazdırılır.

        for(int a = 0; a < 10000; a++){
            for(int b = 0; b < 10000; b++){
                for(int c = 0; c < 10000; c++){
                    System.out.println(a*b*c);
                }
            }
        }
        // Bu döngü 10^12 kez çalışır. Bu da 1 trilyon kez demektir.
    }
}
