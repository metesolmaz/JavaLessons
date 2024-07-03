import matematik.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız:");
        String isim = scanner.nextLine();
        System.out.println("Merhaba "+isim);

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(4, 5);
        System.out.println("Sonuc: "+sonuc);

        Logaritma logaritma = new Logaritma();
        double log = logaritma.logaritma(10, 2);
        System.out.println("Logaritma: "+log);
    }
}