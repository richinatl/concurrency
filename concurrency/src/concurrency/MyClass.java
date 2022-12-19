package concurrency;



// Instead of using synchronized methods or otherwise using the lock associated with this, 
//we create two objects solely to provide locks.
public class MyClass {
    private long c1 = 0;
    private long c2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void inc1() {
        synchronized(lock1) {
            c1++;
        }
    }

    public void inc2() {
        synchronized(lock2) {
            c2++;
        }
    }
}

//You must be absolutely sure that it really is safe to interleave access of the affected fields
