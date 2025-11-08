import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ArrayRotation {
    
 public static void OneRotation(int[] nums){
        int temp = nums[0];
        int n = nums.length; // one  parse
        for(int i = 1 ; i < n;i++){
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
        System.out.println(Arrays.toString(nums));
 }


 public static void NthRotations(int[] nums,int d){
       int n = nums.length;
       d = d%n;
 //   int[] temp = {1,2};
   List<Integer> temp = new ArrayList<>();//O(d)+O(n-d)+O(d) => O(n+d)
   for(int k = 0 ; k < d ;k++){
    temp.add(nums[k]);
   }

    for(int  i = d ; i< n;i++){ 
        nums[i-d] = nums[i];
    }   
    for(int  i = n-d ; i< n;i++){
        nums[i] = temp.get(i-(n-d));      
    }
    System.out.println(Arrays.toString(nums));

 }

 public static void OptimalRotation(int[] nums,int start,int end){

    while (start <= end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--; 
    }
    
 }
 public static void RigthRotation(int[] nums,int start,int end){

    while (start <= end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--; 
    }
    
 }

 
    public static void main(String[] args) {
        
        int arr[ ] ={1,2,3,4,5,6};
       int n = arr.length;
      //  OneRotation(arr);

       //  NthRotations(arr, 14);


       //optimal for reducing space complixity
        Scanner sc = new Scanner(System.in);//O(2n)
       System.out.println("enter the number of rotation:");
       int d = sc.nextInt();
       d = d%n;
       

        //left rotation
       OptimalRotation(arr, 0, d -1);
       OptimalRotation(arr, d, n-1);
       OptimalRotation(arr, 0, n-1);
       System.out.println(Arrays.toString(arr));


//rigth rotation
        RigthRotation(arr, n - d, n - 1);
        RigthRotation(arr, 0, n - d - 1);
        RigthRotation(arr, 0, n - 1);

        System.out.println("Array after right rotation:");
        System.out.println(Arrays.toString(arr));

sc.close();

    }
}
