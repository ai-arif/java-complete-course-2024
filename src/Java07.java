import java.util.Scanner;

public class Java07 {
    public static void main(String[] args) {
        //Area of a Cuboid

        int height, length, width;
        double area, volume;

        System.out.println("Enter the value of height, length, width");
        Scanner sc = new Scanner(System.in);

        height = sc.nextInt();
        length = sc.nextInt();
        width = sc.nextInt();

        area = 2*(length*width + length*height + width*height);
        volume = length * width * height;

        System.out.println("Area is: "+area);
        System.out.println("Volume is: "+volume);
    }
}
