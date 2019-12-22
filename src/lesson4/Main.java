package lesson4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("Katia");
        mll.insertFirst("Maria");
        mll.insertFirst("Luba");
        mll.insertFirst("Luba");
        mll.insertFirst("Luba");
//        System.out.println(mll.contains("Maria"));
//        System.out.println(mll.indexOf("Luba"));
//        System.out.println(mll);
//        mll.insert(1,"Petia");

        System.out.println(mll);
        mll.insertLast("Sania");
        System.out.println(mll);

        mll.insert(3, "Petia");
        System.out.println(mll);

        mll.remove("Luba");
        System.out.println(mll);

        for (String s : mll) {
            System.out.print(s + " ");
        }

//        Iterator<String> iterator = mll.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }

//        mll.removeLast();
//        mll.removeFirst();
//        System.out.println(mll);

//        System.out.println(mll.remove("Luba"));
//        System.out.println(mll);

//        for (int i = 0; i < 3 ; i++) {
//            System.out.print(mll.removeFirst()+" ");
//        }


    }
}
