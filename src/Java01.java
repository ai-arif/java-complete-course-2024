import java.util.Scanner;

public class Java01 {
    public static void main(String[] args) {

        //Scanner in java

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The summation is: " + sum);


        String name;

        System.out.println("Please enter your name");
        name = sc.nextLine();

        System.out.println("Your name is: " + name);
    }
}
