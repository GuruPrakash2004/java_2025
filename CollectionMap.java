import java.util.HashMap;
import java.util.Map;


public class CollectionMap {
    
public static void main(String[] args) {
    Map<String,Integer> student = new HashMap<>();

    student.put("guru", 50);//keys are a {set} are unique
    student.put("hari", 90);//
    student.put("ragu", 70);
    student.put("raju", 0);

    student.put("guru", 45);

    System.out.println(student.keySet());

    for(String name: student.keySet()){
        System.out.println(name+ ":" + student.get(name));
    }

    }

}
