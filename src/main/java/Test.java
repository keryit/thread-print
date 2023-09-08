public class Test {
    public static void main(String[] args) {
        Thread evenThread = new MyThread(true);
        Thread oddThread = new MyThread(false);
        evenThread.start();
        oddThread.start();
    }
}
