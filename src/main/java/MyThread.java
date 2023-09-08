public class MyThread extends Thread {
    private static final Object lock = new Object();
    private static int currentNumber = 1;
    private final boolean even;

    public MyThread(boolean even) {
        this.even = even;
    }

    @Override
    public void run() {
        while (currentNumber <= 100) {
            synchronized (lock) {
                if ((even && currentNumber % 2 == 0) || (!even && currentNumber % 2 != 0)) {
                    System.out.println(currentNumber + " " + Thread.currentThread().getName());
                    currentNumber++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
