import java.util.* ;

public class Main {
    public static void main(String[] args){

        // 1D ARRAYS
        // Scanner sc = new Scanner(System.in) ;
        // int n = sc.nextInt() ; 
        // int[] a = new int[n] ;
        // for(int i=0 ; i<n ; i++) a[i] = sc.nextInt() ; 
        // for(int i=0 ; i<n ; i++){
        //     System.out.print(a[i]) ;
        //     System.out.print(" ") ;
        // }

        // 2D ARRAYS
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() , m = sc.nextInt() ;
        int[][] a = new int[n][m] ;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                a[i][j] = sc.nextInt() ;
            }
        } 

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(a[i][j]) ;
                System.out.print(" ") ; 
            }
            System.out.println() ;
        } 


    }
}
