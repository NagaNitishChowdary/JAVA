import java.util.* ;
import java.io.* ;

public class Main{
    public static void main(String[] args){

        // LinkedHashSet --- duplicates not allowed , insertion order is preserved
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>() ;

        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        for(int i=0 ; i<n ; i++){
            int h = sc.nextInt() ;
            lhs.add(h) ; 
        }

        System.out.println(lhs) ;

        // SAME METHODS AS THE HashSet

    }
}
