package concurrency;

public class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
    
}
    
    // Synchronized statement
//    public void addName(String name) {
//        synchronized(this) {
//            lastName = name;
//            nameCount++;
//        }
//        nameList.add(name);
//    }

