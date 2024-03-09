public class Index {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya".indexOf('M'));
        System.out.println("Merhaba Dünya".indexOf('a'));
        System.out.println("Merhaba Dünya".indexOf('a',5));

        System.out.println("Merhaba Dünya".indexOf("haba"));
        System.out.println("Merhaba Dünya".indexOf("Dünya"));
        System.out.println("Merhaba Dünya".indexOf("dunya",5));

        System.out.println("Merhaba Dunya".lastIndexOf('M'));
        System.out.println("Merhaba Dunya".lastIndexOf('a'));
        System.out.println("Merhaba Dunya".lastIndexOf('a',5));

        System.out.println("Merhaba Dunya".lastIndexOf("haba"));
        System.out.println("Merhaba Dunya".lastIndexOf("Dunya",5));
        System.out.println("Merhaba Dunya".lastIndexOf("dunya",5));
    }
}
