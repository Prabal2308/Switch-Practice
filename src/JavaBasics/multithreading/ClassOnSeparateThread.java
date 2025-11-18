package JavaBasics.multithreading;

//Running task on a separate thread by creating class and extending Thread class
class World extends Thread{
    @Override
    public void run() {
        for(;;) {
            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}

//Running task on a separate thread by creating class and implementing Runnable interface
class World1 implements Runnable{
    @Override
    public void run() {
        for(;;) {
            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class ClassOnSeparateThread {

    public static void main(String[] args) {
//        World world = new World();
//        world.start();

        World1 world1 = new World1();
        Thread t1 = new Thread(world1);
        t1.start();

        for(;;) {
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
