import java.util.Scanner;

public class Java05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double s, area;

        System.out.println("Enter the value of 3 sides of a Triangle");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = ((a+b+c)/2f);

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of the Triangle is: "+area);

    }
}
