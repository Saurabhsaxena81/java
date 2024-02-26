/**
 * functions /Methods 
 * camelCase
 * 
 * public int addition(int operand1,int operand2){
 *   //body of the function
 * }
 * 
 * here public-> is access modifier, int -> is return type ,and, addition-> is the function name 
 */

public class Methods {
    public static void main(String[] args) {
        System.out.println("In main method ");
        greetUser();
        System.out.println("Method calling");
        pattern();
        patternLoop();
        // pattern();
    }
    public static void greetUser(){
        System.out.println("Good Morning from kGCoding");
 
    }
    public static void pattern(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
    public static void patternLoop(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
