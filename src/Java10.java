public class Java10 {
    public static void main(String[] args) {
        //Bitwise operators

        //swapping two numbers without using third variable

        int a = 10, b = 15;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a + " " + b);

        byte b1 = 9, b2 = 12;
        byte c;

        c = (byte)(b1<<4);
        c = (byte)(c|b);

        System.out.println((c&0b11110000)>>4);
        System.out.println((c*0b00001111)>>4);

//        Widening conversions: byte -> short -> int -> long -> float -> double
//        Narrowing conversions: double -> float -> long -> int -> short -> byte
    }

}
