package disruptor;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService exe = Executors.newCachedThreadPool();

        PCDataFactory pcDataFactory = new PCDataFactory();

        int bufferSize = 1024;

        Disruptor<PCData> disruptor = new Disruptor<PCData>(pcDataFactory, bufferSize, exe
                , ProducerType.MULTI, new BlockingWaitStrategy());

        disruptor.handleEventsWithWorkerPool(new Consumer(), new Consumer(), new Consumer(), new Consumer());

        disruptor.start();

        RingBuffer<PCData> ringBuffer = disruptor.getRingBuffer();
        Producer producer = new Producer(ringBuffer);
        ByteBuffer bb = ByteBuffer.allocate(8);

        for (long i = 0; ; i++) {
            System.out.println("add data:" + i);
            bb.putLong(0, i);
            producer.pushData(bb);
            Thread.sleep(100);
        }
    }

}
