import java.util.* ;
import java.io.* ; 

public class Main {
    public static void main(String[] args){
        
        // STACK SYNTAX
        // Stack<type> st = new Stack<type>() ;
        // st.push() , st.peek() , st.pop() , st.search(ele)
        
        Stack<Integer> st = new Stack<Integer>() ; 

        for(int i=0 ; i<5 ; i++) st.push(i) ;
        // while(!st.empty()){
        //     System.out.print(st.peek() + " ") ;
        //     st.pop() ;
        // }

        while(!st.empty()){
            System.out.print(st.pop() + " ") ;
        }

    }
}
