import java.util.* ;
import java.io.* ;

public class Main{
    public static void main(String[] args){

        // HashMap --- stores as key value pair
        // insertion order is not preserved  
        // duplicates keys are not allowed 

        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>() ;
        // hashMap.put(key,value)   // hashMap1.putAll(hashMap2)
        // hashMap.get(key)   // hashMap.remove(key)
        // hashMap.containsKey(key)  // hashMap.size() 
        // hashMap.containsValue(value) // hashMap.isEmpty()
        // hashMap.clear() 

        hmap.put(1,83) ;  hmap.put(1,183) ;

        HashMap<Integer,Integer> hmap2 = new HashMap<Integer,Integer>() ;
        hmap2.put(2,84) ;
        hmap2.put(1,283) ;

        // hashMap1.putAll(hashMap2)
        hmap.putAll(hmap2) ; 

        System.out.println(hmap) ;

        // hashMap.get(key)
        System.out.println(hmap.get(2)) ;

        // hashMap.remove(key)
        hmap.remove(2) ;

        // hashMap.containsKey(key)
        System.out.println(hmap.containsKey(1)) ; 

        // hashMap.containsValue(value)
        System.out.println(hmap.containsValue(283)) ; 

        // Iterating through hash map 
        for(Map.Entry<Integer,Integer> e : hmap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue()) ; 
        }

    }
}
