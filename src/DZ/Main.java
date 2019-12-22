package DZ;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

        int N = 1000;
        long timetostart = System.currentTimeMillis();

        MyArray<Integer> arrayInsert = new MyArray<Integer>(N);
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < arrayInsert.getSize(); i++) {
            arrayInsert.insert(random.nextInt());
        }

        long timeBeforeInsert = System.currentTimeMillis();

        arrayInsert.sortSelect();

        System.out.println("sortInsert for " + arrayInsert.getSize() + " elements:");
        System.out.println("Time cost: " + (System.currentTimeMillis() - timeBeforeInsert)  + " ms");
        System.out.println();


        MyArray<Integer> arrayBubble = new MyArray<Integer>(N);
        for (int i = 0; i < arrayBubble.getSize(); i++) {
            arrayBubble.insert(random.nextInt());
        }
        long timeBefore = System.currentTimeMillis();
        arrayBubble.sortBubble();
        System.out.println("bubbleSort for " + arrayBubble.getSize() + " elements:");
        System.out.println("Time cost: " + (System.currentTimeMillis() - timeBefore) + " ms");
        System.out.println();




        MyArray<Integer> arraySelect = new MyArray<Integer>(N);
        for (int i = 0; i < arraySelect.getSize(); i++) {
            arraySelect.insert(random.nextInt());
        }
        long timeBeforeSelect = System.currentTimeMillis();
        arraySelect.sortSelect();
        System.out.println("sortSelect for " + arraySelect.getSize() + " elements:");
        System.out.println("Time cost: " + (System.currentTimeMillis() - timeBeforeSelect)  + " ms");
        System.out.println();










    }


}
