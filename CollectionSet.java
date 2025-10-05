import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
    
public static void main(String[] args) {
    Set<Integer> num = new TreeSet<Integer>();//interface->list,queue,Set
        num.add(6);
        num.add(14);//set will not follow the  sequence
        num.add(4);//set does not support index and no duplicate elements
        num.add(13);// insted of unf=sing the HasSet -> treeSet helps in sorting of this set
        num.add(5);
        num.add(4);
        num.add(3);
        num.add(20);
        num.add(60);

     Iterator<Integer> values =   num.iterator();
     
     while (values.hasNext()) {
         System.out.println(values.next());
     }
       
    //   for( int n : num){
        
    //     System.out.println(n);
    //     }

}

}
