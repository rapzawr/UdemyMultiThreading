package com.modernjava.threading;

public class SupervisorExample {
    public static void main(String[] args) throws InterruptedException {
        Worker1 worker1 = new Worker1();
        Worker2 worker2 = new Worker2();

        worker1.executeWork();
        worker2.executeWork();

    }
}

    class Worker1 {
        public void executeWork() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Worker 1 is Executing task # " + i);

            }

        }
    }
     class Worker2 {
        public void executeWork() throws InterruptedException {
            for( int i = 0 ; i < 10 ; i++){
                Thread.sleep(100);
                System.out.println("Worker 2 is Executing task # " + i);
            }
        }
    }


