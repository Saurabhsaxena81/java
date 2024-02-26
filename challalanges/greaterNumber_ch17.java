// package challalanges;
import java.util.Scanner;
public class greaterNumber_ch17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input three numbers:");
        int num1,num2,num3;
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();
        if(num1>=num2 && num1 >= num3){
            
                System.out.println(num1+" is greatest");
        }else if(num2>num3 && num2>num1)
                   System.out.println(num2  +"is greatest");
        else{
            System.out.println(num3+" is greatest");
        }
    }
}
