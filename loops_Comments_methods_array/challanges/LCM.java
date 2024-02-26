import java.util.Scanner;

/**
 * LCM -> smallest number which gets divided by both numbers with zero remainder 
 */
public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pleaseenter first number ");
        int  num1= input.nextInt();
        System.out.println("Please enter secind number ");
        int num2 = input.nextInt();
        System.out.println("LCM is:"+(function_Lcm(num1,num2)));    
    }
    public static int function_Lcm(int first,int second){

        int i=1; //,first,second;
        // if(num1<num2){
        //     first=num1;
        //     second=num2;
        // }
        // else{
        //     first = num2;
        //     second= num1;
        // }
        while(true){
            int factor = i* first;
            if((factor%second)==0){
                return factor;

            }
            i++;
        }
        // return 0;
    }

    
}
