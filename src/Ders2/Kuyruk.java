package Ders2;

class Kuyruk{
    int[] arr;
    int son;

    public Kuyruk(int size){
        arr = new int[size];
        son = 0;

    }

    public static void main(String[] args)throws Exception{
        Kuyruk kuyruk = new Kuyruk(5);

        kuyruk.queue(10);
        kuyruk.peek();
        kuyruk.count();

        kuyruk.queue(20);
        kuyruk.peek();
        kuyruk.count();

        kuyruk.queue(30);
        kuyruk.peek();
        kuyruk.count();

        kuyruk.queue(30);
        kuyruk.peek();
        kuyruk.count();

        kuyruk.queue(30);
        kuyruk.peek();
        kuyruk.count();

        /*
        kuyruk.queue(30);
        kuyruk.peek();
        kuyruk.count();
        */

        kuyruk.dequeue();
        kuyruk.peek();
        kuyruk.count();

        kuyruk.dequeue();
        kuyruk.peek();
        kuyruk.count();

        kuyruk.dequeue();
        kuyruk.peek();
        kuyruk.count();

        kuyruk.dequeue();
        kuyruk.peek();
        kuyruk.count();

        kuyruk.dequeue();
        kuyruk.peek();
        kuyruk.count();

        kuyruk.dequeue();
        kuyruk.peek();
        kuyruk.count();





    }

    public void queue(int i )throws Exception{
        if(son==arr.length){
            throw new Exception("kuyruk doldu");
        }else{
            arr[son++]=i;
        }

    }

    public int dequeue()throws Exception{

        if(son==0) {
            throw new Exception("kuyruk boşaldı");
        }
        else{
            int a = arr[0];


            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];

            }
            son--;
            return a;
        }
    }

    public void peek(){
        System.out.println(arr[0]);
    }

    public int count(){
        return arr[son];
}


}
