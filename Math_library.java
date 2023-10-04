import java.util.* ; 

public class Math_library {
    public static void main(String args[]) {
        
        // MATH FUNCTIONS
        int a = 3 , b = 4 ; 
        System.out.println("Minimum is " + Math.min(a,b)) ;
        System.out.println("Maximum is " + Math.max(a,b)) ;
        System.out.println("Absolute is " + Math.abs(a-b)) ;
        System.out.println("Square root " + Math.sqrt(a)) ;
        System.out.println("power " + Math.pow(a,b)) ;

        // TYPECASTING
        int knnc = (int)Math.sqrt(a) ;
        System.out.println(knnc) ;
    }
}
