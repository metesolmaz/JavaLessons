public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int toplam = dortIslem.Topla(2, 3);
        System.out.println("Toplam:" + toplam);
        int cikarim = dortIslem.Cikar(3, 2);
        System.out.println("Cikarim:" + cikarim);
        int carpim = dortIslem.Carp(2, 3);
        System.out.println("Carpim:" + carpim);
        int bolum = dortIslem.Bol(4, 2);
        System.out.println("Bolum:" + bolum);
    }
}