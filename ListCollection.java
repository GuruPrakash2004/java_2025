import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListCollection {
    
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(50);
        nums.add(7);
        nums.add(8);
        nums.add(1);
        nums.add(42);

        Collections.sort(nums);

        System.out.println(nums);

    }

}
