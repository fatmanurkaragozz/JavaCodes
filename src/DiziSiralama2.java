public class DiziSiralama2 {
    public static void main(String[] args) {

    //bir dizideki en büyük elemanı ve bu elemanın indis (index) bilgisini nasıl bulabiliriz ?

    int[] dizi ={34,65,89,12,23,55,97};
    int max = dizi[0];
    int maxIndex = 0;

    for(int i = 0; i < dizi.length; i++){

        if(dizi[i] > max){
            max = dizi[i];
            maxIndex = i;
        }
    }
        System.out.println("Dizinin en büyük değeri: " + max);
        System.out.println("Bu değerin indeksi: " + maxIndex);
    }
}
