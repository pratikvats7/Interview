package Java.interview;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<String> store = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            store.add("product" + (i + 1));
        }
        //start two test workers to consume and destoy produce each can be destroyed only once

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < store.size(); i++) {
                synchronized (store) {
                    if (!store.isEmpty()) {
                        System.out.println("Thread 1 removing: " + store.remove(0));
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = store.size() - 1; i >= 0; i--) {
                synchronized (store) {
                    if (!store.isEmpty()) {
                        System.out.println("Thread 2 removing: " + store.remove(i));
                    }
                }
            }
        });

        // Starting both threads
        thread1.start();
        thread2.start();

        // code here
    }

    private static class TestWorker implements Runnable {

        // code here
        private List<String> ar;

        public TestWorker(List<String> ar) {
            this.ar = ar;
        }

        @Override
        public void run() {
            while(ar.size()>0){
            synchronized (ar) {
                System.out.println(ar.get(0) + "destoyed by" + this);
                ar.remove(ar.get(0));
            }
            }
        }
    }
}