public class Test {
    public static void main(String[] args) {
        Thread firstThread = new MyThread(true);
        Thread secondThread = new MyThread(false);
        firstThread.start();
        secondThread.start();
    }
}
