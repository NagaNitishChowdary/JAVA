import java.util.* ;
import java.io.* ;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;

        // ArrayList<Type> al = new ArrayList<Type> () ;
        // .add(ele) .get(index)  .size()
        // .add(ind,ele)  .remove(index)
        // .set(ind,ele)  .contains(ele)
        // .isEmpty()  .addAll(al2)  .removeAll(al2)
        // Collections.sort(arr)

        int n = sc.nextInt() ;
        ArrayList<Integer> arr = new ArrayList<Integer> () ;

        for(int i=0 ; i<n ; i++){
            int h = sc.nextInt() ;
            arr.add(h) ; 
        }

        System.out.println(arr) ;

        arr.add(0,83) ;  arr.remove(0) ;
        arr.set(1,410) ;  

        System.out.println(arr.contains(410)) ;

        System.out.println(arr.isEmpty()) ;

        ArrayList<Integer> arr2 = new ArrayList<Integer> () ;
        arr2.add(111) ; arr2.add(1111) ;

        arr.addAll(arr2) ;

        for(int i=0 ; i<arr.size() ; i++){
            System.out.print(arr.get(i) + " ") ;
        } 
        System.out.println() ;

        arr.removeAll(arr2) ;

        Collections.sort(arr) ; 
        Collections.reverse(arr) ; 

        System.out.println(arr) ; 
    }
}
