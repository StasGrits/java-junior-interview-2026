package stream;

import java.util.concurrent.*;

public class AdvancedConcurrencyDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread threadRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Runnable is running..."); // не возвращает результат, выполняет разовую фунцию
            }
        });
        threadRunnable.start();


        Thread threadLambda = new Thread(() -> System.out.println("Thread Lambda is running..."));
        threadLambda.start();

        ExecutorService exService = Executors.newSingleThreadExecutor();
        Callable <String> callableThread = () -> {
            return "Callable Thread " + "is running..."; // может и должен возвращать результат. удобен при сложный процессах
        };
        Future<String> future = exService.submit(callableThread);
        String s = future.get();

        System.out.println(s);
        exService.shutdown();
    }
}
