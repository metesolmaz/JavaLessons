public class Main {
    public static void main(String[] args) {
        KronometreThread kronometreThread1 = new KronometreThread("KronometreThread1");
        KronometreThread kronometreThread2 = new KronometreThread("KronometreThread2");
        KronometreThread kronometreThread3 = new KronometreThread("KronometreThread3");

        kronometreThread1.start();
        kronometreThread2.start();
        kronometreThread3.start();
    }
}