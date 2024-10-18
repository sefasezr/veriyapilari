package Ders2;

public class Queue {
    public int front;
    public int rear;
    public int sayac;
    public int[] arr ;

    public Queue(int size) {
        this.front = size-1;
        this.rear = 0;
        this.sayac = 0;
        this.arr = new int[size];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(12);
        System.out.println(queue.peek());

        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        System.out.println(queue.count());
        queue.enqueue(16);
        queue.dequeue();
        System.out.println(queue.count());
        queue.dequeue();
        System.out.println(queue.count());


        queue.dequeue();
    }

    public void enqueue(int x) {
        if(sayac >= arr.length) {
            throw new RuntimeException("Queue is full");
        }else{
            this.arr[this.sayac++] = x;
        }

    }

    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }else{
            int a = this.arr[this.rear];
            rear++;
            sayac--;
            return a;
        }

    }

    public int peek(){
        return arr[rear];
    }

    public Boolean isEmpty(){
        if(sayac == rear){
            return true;
        }
        return false;

    }
    public int count(){
        return sayac;
    }

}
