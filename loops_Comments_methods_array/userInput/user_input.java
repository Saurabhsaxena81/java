import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter your name ");
        String name =input.nextLine(); // for taking input of String 
        System.out.println("Your name is:"+name);
        String age = input.next();  // for single word 
        System.out.println(age);

}
}
