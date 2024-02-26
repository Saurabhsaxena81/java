// package challalanges;
import java.util.Scanner;

public class converteFeranheightTocelsius {
    public static void main(String[] args) {
        Scanner temp  = new Scanner(System.in);
        System.out.println("input temperature in the form of farenheight");
        int farenheight = temp.nextInt();
        System.out.println(farenheight);

        double celciues;
        celciues=(farenheight-32) * 5.0f / 9.0f;
        // celciues = celciues * 0.55;
        System.out.println(celciues);
        System.out.println("Temperature in the celciues equivalent to farenheight is :"+celciues);
    }
}
