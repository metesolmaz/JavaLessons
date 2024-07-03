public class Main {
    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[2]);
        }

        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Hata oluştu.. "+e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata oluştu.. "+e);
        }

        catch (Exception e) {
            System.out.println("Hata oluştu.. "+e);
        }
        finally {
            System.out.println("Ben her türlü çalışırım");
        }

    }
}