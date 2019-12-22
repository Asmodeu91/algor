package lesson3;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(stack.pop());
//        }

//        Expression e = new Expression("(45+[r-e]+ {45645=3})");
//        System.out.println(e.checkBracket());

//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(queue.remove());
//        }

        MyPriorityQueue<Integer> pq = new MyPriorityQueue<>(10, Comparator.reverseOrder());
        pq.insert(7);
        pq.insert(2);
        pq.insert(8);
        pq.insert(9);
        pq.insert(3);

        for (int i = 0; i <5 ; i++) {
            System.out.println(pq.remove());
        }

    }
}
