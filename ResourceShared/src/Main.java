public class Main {

    public static void main(String[] args) {
        TestThread testThread = new TestThread();

        for (int i = 0; i < 10; i++) {
            new Thread(testThread).start();
        }
    }
}

class TestThread implements Runnable {
    private int tickets = 100;

    public void run() {
        while (true) {
            TicketsSale();
        }
    }

    private synchronized void TicketsSale() {
        if (tickets > -1) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Tickets: " + tickets--);
        }
    }
}