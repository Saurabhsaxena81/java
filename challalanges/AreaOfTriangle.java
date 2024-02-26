// package challalanges;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("input the height and base of the traingle ");
        int height ,base;
        height= triangle.nextInt();
        base = triangle.nextInt();
        System.out.println("The area of the triangle is :"+(0.5*height*base));
    }
}
