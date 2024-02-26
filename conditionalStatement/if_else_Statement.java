// package conditionalStatement;
public class if_else_Statement {
    public static void main(String[] args) {
        boolean isSenior = true;
        // if (false/**condition should always result in boolean*/) {
        //     System.out.println("Hello World!");
        // }
        // else{
        // System.out.println("Bye!");
        // }
        if (isSenior) {
            System.out.println("Hello senior citizen!");
        } else if(!isSenior){
         System.out.println("Chal be chutiye");   
        }
        else{
            System.out.println("koi na beta");
        }
    }
}
