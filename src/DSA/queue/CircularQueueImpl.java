package DSA.queue;

//asked in VidyutTech

class MyCircularQueue{
    private int[] queue;
    private int frontIndex;
    private int rearIndex;

    public MyCircularQueue(int size){
        queue = new int[size];
        frontIndex = -1;
        rearIndex = -1;
    }

    public int front(){
        if(frontIndex == -1 || frontIndex == rearIndex) return -1;
        return queue[frontIndex];
    }

    public int rear(){
        if(rearIndex <= 0 || frontIndex == rearIndex) return -1;
        return queue[rearIndex];
    }

    public boolean enQueue(int value){
        if((rearIndex + 1) % queue.length == frontIndex) return false;
        if(frontIndex == -1) rearIndex = frontIndex = 0;
        else rearIndex = (rearIndex + 1) % queue.length;
        queue[rearIndex] = value;
        return true;
    }

    public boolean deQueue(){
        if(frontIndex == -1) return false;
        if(rearIndex == frontIndex) frontIndex = rearIndex = -1;
        else frontIndex = (frontIndex + 1) % queue.length;
        return true;
    }

    public void printQueue(){
        if(frontIndex == -1){
            System.out.print("Queue is Empty");
        }
        int i = front();
        System.out.print("[");
        while(true){
            System.out.print(queue[i] + " ");
            if(i == rearIndex) break;
            i = (i + 1) % queue.length;
        }
        System.out.println("]");
    }
}
public class CircularQueueImpl {

    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(8);
        queue.enQueue(4);
        queue.enQueue(3);
        queue.enQueue(2);
        queue.enQueue(5);
        queue.enQueue(1);
        queue.printQueue();
        queue.deQueue();
        queue.deQueue();
        queue.printQueue();
        queue.enQueue(4);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.printQueue();
        queue.enQueue(10);
        queue.printQueue();
    }

}
