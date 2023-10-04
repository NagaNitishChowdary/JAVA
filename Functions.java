import java.util.* ; 

public class Main {

    public static int mini(int a[][],int n,int m){
        int mini = 100000000 ;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                mini = Math.min(a[i][j] , mini) ;
            }
        }
        return mini ; 
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() , m = sc.nextInt() ; 
        int[][] a = new int[n][m] ;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                a[i][j] = sc.nextInt() ; 
            }
        } 
        for(int[] it:a){
            for(int knnc:it){
                System.out.print(knnc) ;
                System.out.print(" ") ;
            }
            System.out.println() ;
        }
        System.out.println() ;

        int knnc = mini(a,n,m) ;
        System.out.println(knnc) ; 
 
    }
}
