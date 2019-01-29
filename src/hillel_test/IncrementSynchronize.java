package hillel_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IncrementSynchronize {
    private int value = 0;
    //getNextValue()


    public int getNextValue_1() {
        Lock locker = new ReentrantLock();
        locker.lock();
        try {
            return value++;
        } finally {
            locker.unlock();
        }
    }


    public synchronized int getNextValue_2() {
        return value++;
    }


    public int getNextValue_3() {
        synchronized (this) {
            return value++;
        }
    }
}
