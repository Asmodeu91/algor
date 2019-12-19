package DZ;

import java.math.BigInteger;
import java.util.Comparator;

public class MyArray<T> {

    private Object[] arr;
    private int size;
    private int current;
    private boolean isSorted = false;
    private BigInteger iterations = BigInteger.ZERO;
    private final float factor = 1.5f;

    public MyArray(int size) {
        this.current = 0;
        this.arr = new Object[size];
    }

    public int getSize() {
        return arr.length;
    }

    public BigInteger getIterations() {
        return iterations;
    }

    public void insert(T value) {
        if (this.current == this.arr.length) {
            Object[] newArr = new Object[(int) (current * factor)];
            System.arraycopy(this.arr, 0, newArr, 0, current);
            this.arr = newArr;
        }
        this.arr[this.current] = value;
        this.current++;
    }

    public boolean delete(T value) {
        int index = search(value);
        if (index < 0) return false;
        System.arraycopy(this.arr, index + 1,
                this.arr, index,
                --this.current - index);
        return true;
    }

    private int search(T value) {
        for (int i = 0; i < this.current; i++) {
            if (this.arr[i].equals(value))
                return i;
        }
        return -1;
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }

    public void sortBubble() {
        iterations = BigInteger.ZERO;
        for (int i = current - 1; i > 1; i--)
            for (int j = 0; j < i; j++)
                if (Double.compare(((Number) this.arr[j]).doubleValue(), ((Number) this.arr[j + 1]).doubleValue()) > 0) {
                    change(j, j + 1);
                    iterations = iterations.add(BigInteger.ONE);
                }
        this.isSorted = true;

    }

    private void change(int a, int b) {
        Object temp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = temp;
        System.out.println(temp);
    }

    public void sortSelect() {
        iterations = BigInteger.ZERO;
        for (int out = 0; out < this.current; out++) {
            int pos = out;
            for (int in = out + 1; in < this.current; in++) {
                if (Double.compare(((Number) this.arr[in]).doubleValue(), ((Number) this.arr[pos]).doubleValue()) < 0) {
                    pos = in;
                    iterations = iterations.add(BigInteger.ONE);
                }
            }
        }
    }
            public void sortInsert() {
                iterations = BigInteger.ZERO;
                for (int out = 0; out < this.current; out++) {
                    Object temp = this.arr[out];
                    int in = out;
                    while (in > 0 && Double.compare(((Number) this.arr[in - 1]).doubleValue(), ((Number) temp).doubleValue()) >= 0) {
                        this.arr[in] = this.arr[in - 1];
                        in--;
                        iterations = iterations.add(BigInteger.ONE);
                    }
                    this.arr[in] = temp;
                }
                this.isSorted = true;
            }

}





