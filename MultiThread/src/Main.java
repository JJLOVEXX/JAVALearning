public class Main {
    public static void main(String[] args) {

        MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread);

        YourThread yourThread=new YourThread();
        Thread thread1=new Thread(yourThread);

        thread.start();
        thread1.start();

        System.out.println("你会多线程吗");

    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("我不会多线程");
    }
}
class YourThread implements Runnable{

    @Override
    public void run() {
            System.out.println("我真的不会多线程");
    }
}