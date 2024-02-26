import java.util.Scanner;
public class bitwiseAnd{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("ShowcasingBitwise And operator");
        System.out.println("Please enter the first number ");
        int first =input.nextInt();
        System.out.println("Input second number ");
        int second = input.nextInt();
        System.out.println("result is "+(first & second));
        System.out.println("Bitwise OR "+(first | second));
        System.out.println("not "+(~first));
        System.out.println("XOR "+(first ^ second));
        System.out.println("left shift "+(first << 2));
        System.out.println("RightShift "+(first >> 2));
    }
}