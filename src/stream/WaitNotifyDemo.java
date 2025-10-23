package stream;

public class WaitNotifyDemo {

    public static void main(String[] args) {

        Store store = new Store();
        Consumer consumer = new Consumer(store);
        Producer producer = new Producer(store);
        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);
        t1.start();
        t2.start();
    }
}

class Store {
    private int product = 0;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("Покупатель приобрёл товар. Количество продукта после покупки: " + product);
        notify();
    }

    public synchronized void put() {
        while (product > 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("Производитель сделал товар. Количество продукта после производства: " + product);
        notify();
    }
}

class Producer implements Runnable {

    Store store;

    Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 12; i++) {
            store.put();
        }
    }
}

class Consumer implements Runnable {
    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 12; i++) {
            store.get();
        }
    }
}


