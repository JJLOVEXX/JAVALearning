public class Main {

    public static void main(String[] args) {
        TestThread testThread=new TestThread();
        new Thread(testThread).start();
        for (int i=0;i<10;i++){
            if (i==5){
                testThread.stopMe();
            }
            System.out.println("Main thread is running.");
        }
    }
}

class TestThread implements Runnable{

    private boolean myFlag=true;

    public void stopMe(){
        myFlag=false;
    }
    @Override
    public void run() {

        while(myFlag)
        {
            System.out.println(Thread.currentThread().getName()+" is running.");
        }

    }
}