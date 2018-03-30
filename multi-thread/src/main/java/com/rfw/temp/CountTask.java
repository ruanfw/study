package com.rfw.temp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * Created by Administrator on 2017/6/22.
 */
public class CountTask extends RecursiveTask<Long> {

    private static final int THRESHOLD = 10000;

    private long start;

    private long end;

    public CountTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {

        long sum = 0;
        if ((end - start) < THRESHOLD) {
            for (long i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            long step = (end - start) / 100;
            List<CountTask> subTasks = new ArrayList<>();
            long pos = start;

            for (int i = 0; i < 100; i++) {
                long lastOne = pos + step;
                if (lastOne > end) {
                    lastOne = end;
                }
                CountTask countTask = new CountTask(pos, lastOne);
                pos += step + 1;
                subTasks.add(countTask);
                countTask.fork();
            }

            for (CountTask countTask : subTasks) {
                sum += countTask.join();
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
            CountTask task = new CountTask(0, 200000L);
        ForkJoinTask<Long> result = forkJoinPool.submit(task);

        try {
            long res = result.get();
            System.out.println("sum:" + res);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
