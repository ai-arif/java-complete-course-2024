public class Java09 {
    public static void main(String[] args) {
        //Bitwise operators

        int a = 15, b = 8, c;
        c = a&b;
        System.out.println(c);

        int a1 = 0b1010, b1 = 0b0110, c1;
        c1 = a1 | b1;
        System.out.println(c1);

        int a2 = 0b1000;
        int b2;
        b2 = a2<<2;
        System.out.println(b2);
    }
}
