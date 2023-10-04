import java.util.* ;
import java.io.* ;

public class Main{
    public static void main(String[] args){

        // HashSet --- Duplicates not allowed , insertion order not preserved
        HashSet<Integer> hs = new HashSet<Integer>() ;
        // HashSet hs = new HashSet() ; 
        // .add(element)   .remove(element)
        // .isEmpty()   .contains(element)
        // .addAll(hashSet2)

        // no index concept , efficient for search
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        for(int i=0 ; i<n ; i++){
            int h = sc.nextInt() ;
            hs.add(h) ;
        }

        System.out.println(hs) ;

        // HashSet.remove(element)
        hs.remove(-3) ;

        for(Integer it:hs){
            System.out.print(it+" ") ;
        }
        System.out.println() ; 

        // HashSet.isEmpty()
        System.out.println(hs.isEmpty()) ;

        // HashSet.contains(element)
        if(hs.contains(4)){
            System.out.println("Element is present") ;
        } else {
            System.out.println("Element is not present") ;
        }

        // hashSet2.addAll(hashSet1) (OR) UNION
        ArrayList<Integer> al2 = new ArrayList<Integer>() ;
        HashSet<Integer> hs2 = new HashSet<Integer>() ; 
        hs2.addAll(hs) ; al2.addAll(hs) ;
        System.out.println(hs2) ; System.out.println(al2) ;


        // INTERSECTION ELEMENTS --- set1.retainall(set2)
        HashSet<Integer> h1 = new HashSet<Integer>() ;
        h1.add(1) ;  h1.add(2) ; h1.add(3) ; 
        HashSet<Integer> h2 = new HashSet<Integer>() ;
        h2.add(3) ; h2.add(4) ; h2.add(5) ;

        h1.retainAll(h2) ;
        System.out.println(h1) ;

        //  DIFFERENCE --- set1.removeAll(set2)
        //  SUBSET --- set1.contains(set2)
    }
}
