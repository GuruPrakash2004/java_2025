import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListCollection {
    
    public static void main(String[] args) {
        //Comparator was a interface
        Comparator<Integer> com = new Comparator<Integer>() {//for changing the logic in the sort method
            public int compare(Integer i ,Integer j){//we have rewrite the compare method in our own logic

                if(i%10 > j %10){// code for check the second digit of a number is greater the the first one 
                    return 1;//swap will take palce 
                }
                else
                    return -1;
            } 
        };
        
        List<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(50);
        nums.add(7);
        nums.add(8);
        nums.add(1);
        nums.add(42);

        Collections.sort(nums, com);

        System.out.println(nums);

    }

}
