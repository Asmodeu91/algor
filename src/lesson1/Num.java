package lesson1;

public class Num {
    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(-5));
//        System.out.println(Integer.toBinaryString(5));
//
//        System.out.println(Integer.toHexString(1024));
//        System.out.println(Integer.toOctalString(8));

//        int a =0x46c7;//100 0110 1100 0111
//        System.out.println(a);

        int a = 7;
//        System.out.println(a+" = "+ Integer.toBinaryString(a));

        int b = a << 2;
//        System.out.println(b+" = "+ Integer.toBinaryString(b));
//
//        a = -5;
//        System.out.println(a+" = "+ Integer.toBinaryString(a));
//        b = a>>1;
//        System.out.println(b+" = "+ Integer.toBinaryString(b));
//        b = a>>>1;
//        System.out.println(b+" = "+ Integer.toBinaryString(b));

        a = 98;
        System.out.println(a + " = " + Integer.toBinaryString(a));
        b = 79;
        System.out.println(b + " = " + Integer.toBinaryString(b));

        int c = a & b;
        System.out.println(c + " = " + Integer.toBinaryString(c));

//        c = a | b;
//        System.out.println(c + " = " + Integer.toBinaryString(c));

        c = a ^ b;
        System.out.println(c + " = " + Integer.toBinaryString(c));

    }
}
