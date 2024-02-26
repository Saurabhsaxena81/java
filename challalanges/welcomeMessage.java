import java.util.Scanner;
public class welcomeMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Welcome "+name+" to the complete java programming course");
    }

}
