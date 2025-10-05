import java.util.Arrays;

public class moverzeros {


    public static int[] movZer(int [] arr,int n){
        int left = 0 ;
        for (int right = 0 ; right < n; right++){
            if(arr[right] != 0){
                 int temp = arr[left];
                    arr [left] = arr[right];
                    arr[right]= temp;

                    left++;
            }
            
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {1,0,12,0,3};
        int n = arr.length;
        int [] result = movZer(arr,n);
        System.out.println(Arrays.toString(result));

    }
    
}
