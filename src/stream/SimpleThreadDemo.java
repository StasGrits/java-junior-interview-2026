package stream;

public class SimpleThreadDemo {

    public static void main(String[] args) {
    Numbers thread1 = new Numbers();
    thread1.start();
    Alphabet thread2 = new Alphabet();
    thread2.run();

    }

     static class Numbers extends Thread {
         @Override
         public void run() {
             String thread1 = Thread.currentThread().getName();

             for (int i = 0; i < 100; i++) {
                 System.out.println(thread1 + " " + i);
             };
         }
     }

     static class Alphabet implements Runnable {
         @Override
         public void run() {
             for (char i = 'A'; i <='Z' ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
             }
         }
     }



}
