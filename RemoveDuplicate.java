import java.util.HashSet;

public class RemoveDuplicate {

    public static int removeDup(int[] arr1){
        int i = 0;
        for(int j = 0 ; j < arr1.length ;j++){
            if(arr1[j] != arr1[i]){
                arr1[i+1] = arr1[j];
                i++;
            }  
        }
        return i+1;

    }

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int[] arr1 ={1,1,1,2,2,2,2,3,3,3,3,4,5};
        for(int j= 0 ; j < arr1.length;j++){         
                hs.add(arr1[j]);//n(log(n))+O(n)
        }
        // for(int j= 1 ; j < arr1.length;j++){
        //     if(arr1[i] != arr1[j]){
        //         hs.add(arr1[j]);
        //         i = j;
        //         j = i+1;
        //     }
        //     i++;\

            
        // }


        //optimal
        int length  = removeDup(arr1);
        for(int k = 0 ; k < length;k++){//O(n)
            System.out.println(arr1[k]);
        }

    }
    
}
