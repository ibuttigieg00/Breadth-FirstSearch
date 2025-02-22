public class Queue {
    String [] queue;
    int maxSize;
    int head;
    int tail;

    public Queue(int maxSizeIn){
        maxSize = maxSizeIn;
        queue = new String [maxSizeIn];
        head = -1;
        tail = 0;
    }

    public boolean checkIfEmpty(){
        return (head == -1);
    }

    public void Enqueue(String value){
        if(tail == maxSize) {
            System.out.println("Queue is full! Cannot enqueue " + value);
            return;
        }
        if(checkIfEmpty()){
            head = 0;
        }

        queue[tail++] = value;
    }

    public String Dequeue(){
        if(checkIfEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return null;
        }
        String s = queue[head];
        queue[head] = null;

        if(head == tail - 1){
            head = -1;
            tail = 0;
        } else {
            head++;
        }
        return s;
    }
}
