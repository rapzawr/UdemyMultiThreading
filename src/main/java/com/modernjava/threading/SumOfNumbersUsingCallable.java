package com.modernjava.threading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    public static int [] array = IntStream.rangeClosed(0,5000).toArray();
    public static long x = System.nanoTime();
    public static int total = IntStream.rangeClosed(0,5000).sum();
    public static long xb= System.nanoTime();
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(x);
        System.out.println("Current Time: " + (xb-x));

        Callable callable1 = () -> {
            int sum = 0 ;
            for (int i = 0 ; i < array.length/2; i++){
                sum+=array[i];
            }
            return sum;
        };

        Callable callable2 = () -> {
            int sum = 0 ;
            for(int i =array.length/2; i< array.length;i++){
                sum+=array[i];
            }
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable1,callable2);
        long y = System.nanoTime();
        List<Future<Integer>> results = executorService.invokeAll(taskList);
        long z = System.nanoTime();
        System.out.println(y);
        System.out.println("CurrentTime:"+ (z-y));
        int k = 0;
        int sum=0;
        for(Future<Integer> result : results){
            sum+=result.get();
            System.out.println("Sum Of" + ++k +"is : " + result.get());
        }
        System.out.println("Sum from the Callable is: " +sum);
        System.out.println("Correct sum from Instream is :" + total);
        executorService.shutdown();

    }

}
