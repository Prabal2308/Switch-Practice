package JavaBasics.multithreading;

import jdk.jshell.MethodSnippet;

class Methods extends Thread{

    public Methods(String name){
        super(name);
    }
    @Override
    public void run() {
//        for(int i = 0; i < 5; i ++){
//            System.out.println(Thread.currentThread().getName() + " with Priority: " + Thread.currentThread().getPriority() + " and Count: " + i);
//        }
//        try {
//            Thread.sleep(1000);
//            System.out.print("Thread is Running....");
//        } catch (InterruptedException e) {
//            System.out.println("Interrupted Exception: " + e);
//        }
//        for(int i = 0; i < 5; i++){
//            System.out.println(Thread.currentThread().getName() + " is Running");
//            Thread.yield();
//        }

//        while(true){
//            System.out.println("Hello World!");
//        }
    }
}
public class ThreadMethods {

    public static void main(String[] args) throws InterruptedException {
//        Methods methods = new Methods();
//        methods.start();
//        methods.join(); //will let the main method wait for the thread to wait until it gets completed in order to resume its further execution
//        System.out.println("hello after 5 seconds");

//        Methods methods = new Methods("Prabal");
//        methods.start();

        //setPriority Method()
//        Methods l = new Methods("Low Priority Thread");
//        Methods m = new Methods("Medium Priority Thread");
//        Methods h = new Methods("High Priority Thread");
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        h.setPriority(Thread.MAX_PRIORITY);
//
//        l.start();
//        m.start();
//        h.start();

        //interrupt method()
//        Methods methods = new Methods("methods");
//        methods.start();
//        methods.interrupt();

        //yield() method
//        Methods t1 = new Methods("t1");
//        Methods t2 = new Methods("t2");
//
//        t1.start();
//        t2.start();

        //setDaemon() method
        Methods t1 = new Methods("t1");
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main done");


    }
}
