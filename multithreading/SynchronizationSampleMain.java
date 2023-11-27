package com.multithreading;

public class SynchronizationSampleMain extends Thread {
	private String threadName;
    private ThreadResourcePoint ts;
    private Thread tRef;

    SynchronizationSampleMain(String name, ThreadResourcePoint ts) {
        // initialize instance variable
        threadName = name;
        this.ts = ts;
    }

    public void run() {
        synchronized (ts) {
            try {
                ts.resource(); // Call resource
            } catch (Exception e) {
                e.printStackTrace();
            }
        } // sync
        System.out.println(threadName + " running completed");
    }// run

    public void startThread() {
        System.out.println("Starting " + threadName);
        if (tRef == null) {
            tRef = new Thread(this, threadName);
            tRef.start();
        }
    }

    public static void main(String args[]) throws InterruptedException {
        ThreadResourcePoint PD = new ThreadResourcePoint();

        SynchronizationSampleMain T1 = new SynchronizationSampleMain("Thread - 1 ", PD);
        SynchronizationSampleMain T2 = new SynchronizationSampleMain("Thread - 2 ", PD);

        T1.startThread();
        Thread.sleep(5000); // Sleep the main thread for 5 seconds
        T2.startThread();
    }
}

