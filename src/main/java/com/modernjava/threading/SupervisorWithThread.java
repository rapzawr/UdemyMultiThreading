package com.modernjava.threading;

public class SupervisorWithThread {
    public static void main(String[] args) {
        ParallelWorker1 parallelWorker1 = new ParallelWorker1();
        ParallelWorker2 parallelWorker2 = new ParallelWorker2();

        parallelWorker1.run();
        parallelWorker2.run();
    }
}

class ParallelWorker1 extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class ParallelWorker2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

