package tmp;

class SomeThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " + i);
        }
    }
}

public class threads {

    public static void main(String[] args) {

        SomeThread test = new SomeThread();
        test.run();
        SomeThread test2 = new SomeThread();
        test2.run();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 77; i++) {
                    System.out.println("Number -- " + i);
                }
            }
        });
        t1.start();
    }

}
