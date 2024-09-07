import java.util.Scanner;

public class Java06 {
    public static void main(String[] args) {
        //Quadratic Equation Solve

        int a, b, c;
        double r1, r2;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = ((-b+Math.sqrt(b*b-4*a*c))/(2*a)); //used precedence
        r2 = ((-b + Math.sqrt(b*b-4*a*c))/(2*a));

        System.out.println("Roots of the quadratic equation are: " + r1 + " " + r2);
    }
}
