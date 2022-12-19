package concurrency;


// A more efficient guard invokes Object.wait to suspend the current thread
public synchronized void guardedJoy() {
    // This guard only loops once for each special event, which may not
    // be the event we're waiting for.
	boolean joy = false;
	
    while(!joy) {
        try {
            wait();
        } catch (InterruptedException e) {}
    }
    System.out.println("Joy and efficiency have been achieved!");
    }
}


// The invocation of wait does not return until another thread has issued a notification 
//that some special event may have occurred