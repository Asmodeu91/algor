package lesson1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 19);
        Person p2 = new Person("Ivan", 19);

//        if(p1.equals(p2)){
//            System.out.println("равны");
//        }else {
//            System.out.println("не равны");
//        }
//
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());

//        int a = 7;
//        inc(a);
//        System.out.println(a);

//        updateName(p1);
//        System.out.println(p1.getName());

//        System.out.println(getFibo(10));
        System.out.println(isPlain(2));

    }

    static void inc(int a){
        a++;
    }

    static void updateName(Person p){
        p.setName("Super"+ p.getName());
    }

    static int getFibo(int num){
        int[] arr = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,
                377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711,
                28657, 46368, 75025, 121393, 196418, 317811, 514229,
                832040, 1346269, 2178309, 3524578, 5702887, 9227465,
                14930352, 24157817, 39088169, 63245986, 102334155,
                165580141, 267914296};
        return arr[num-1];
    }

    static boolean isPlain(int n){
        for (int i = 2; i <= Math.sqrt(n)  ; i++) {
            if(n % i== 0){
                return false;
            }
        }
        return true;
    }

    static int maxValue(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
