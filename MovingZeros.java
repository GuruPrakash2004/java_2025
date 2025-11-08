import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovingZeros {

    public static void brutForce(int []arr){

        List<Integer> temp = new ArrayList<>();

        //brut force approach
        for(int i =0; i < arr.length;i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        for(int j = 0 ; j < temp.size();j++){
            arr[j] = temp.get(j);
        }
        for(int k = temp.size() ; k < arr.length;k++ ){
            arr[k] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }




    public static int[] Optimal(int[] arr){
        int n = arr.length;
        int j = -1 ; 

         for(int i = 0 ; i < n;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
         }
        if(j == -1){ 
            return arr;
        }
         for(int i = j+1 ; i < n;i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                 j++;
            }
           
         }
         return arr;
    }
    

    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,3,3};
      //  brutForce(arr);

     int[] endlength =  Optimal(arr);
     for(int k = 0 ; k < endlength.length; k++){
        System.out.println(arr[k]+" ");
     }


}
}
