public class Main {
    public static void main(String[] args) {
        String ogrenci1="Engin";
        String ogrenci2="Mete";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);

        System.out.println("------------------------");

        String[] ogrenciler=new String[2];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Mete";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}