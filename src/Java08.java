public class Java08 {
    public static void main(String[] args) {
        //Increment & Decrement in Java

        float f1 = 4.4f;
        char c1 = 'A';
        byte b1 = 10;

        int a2 = 5;
        a2++;
        System.out.println(a2);
        ++a2;
        System.out.println(a2);

        int a3 = 5, b2;
        b2 = a3++;
        System.out.println(a3 + " "+ b2);

        int a4 = 5, b3;
        b3 = ++a4;
        System.out.println(a4 + " "+ b3);


        int x = 5, y = 4, z;
        z = 2 * x++ + 3 * ++y;
        System.out.println(z);
    }
}
