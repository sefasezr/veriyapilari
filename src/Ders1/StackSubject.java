package Ders1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackSubject {

    public int [] arr;
    int sayac ;


    public StackSubject(int size) {
        this.arr = new int[size];
        this.sayac = -1;

    }

    public static void main(String[] args) {

        StackSubject s = new StackSubject(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s.pop());
        s.peek();
        s.push(60);
        s.peek();


    }

    public void push(int value) {
        arr[++sayac] = value;
    }

    public int pop(){
        int a = arr[sayac];
        sayac--;
        return a;
    }

    public void peek(){
        System.out.println(arr[sayac]);
    }






}
