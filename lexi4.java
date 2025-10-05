import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class lexi4 {

        public static void main(String[] args) {
       HashMap<String,Integer>  products = new HashMap<>();

       products.put("apple",2000 );
       products.put("banana",4000 );
       products.put("mango",2000 );
       products.put("carrot",4300 );

       Scanner sc = new Scanner(System.in);
       System.out.println("enter the value");
       int amount  = sc.nextInt();

       ArrayList<String> matchedArrayList = new ArrayList<>();

       for(Map.Entry<String,Integer> entry: products.entrySet()){
        if(entry.getValue() == amount){
            matchedArrayList.add(entry.getKey());
        }
       }


         if (matchedArrayList.isEmpty()) {
            System.out.println("No products found with price " + amount);
        } else {
            System.out.println("Products with price " + amount + ": " + matchedArrayList);
        }
sc.close();
    }
}
