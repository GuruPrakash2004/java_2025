import java.util.Arrays;

// public class B_search {

//     public static int binary_search(int []arr,int key){
//         System.out.print(Arrays.sort(arr));
//         Arrays.sort(arr);
        

//         int left = 0,right = arr.length-1;

//         // for(int i = 0; i < arr.length;i++){
//         //     
//         //     if(arr[mid] == key){
//         //         System.out.println(key+" found");
//         //     }
//         //     if(arr[mid] < key){
//         //         left = mid+1;
//         //     }
//         //     if(arr[mid] > key){
//         //         right = mid-1;
//         //     }
//         // }
//         // System.out.println("the "+key+" is not found");

//         while (left<=right){
//             int mid = left+(right-left)/2;

//             if(arr[mid] < key){
//                 left = mid+1;
//             }
//             else if(arr[mid] > key) {
//                 right = mid-1;
//             }
//             else{
//                 return mid;
//             }

//         }
//         return -1;

//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8,6,2,1,4,56,3,66};
        
//         int x = 5;
//          System.out.println(Arrays.sort(arr));
//         int result = binary_search(arr,x);
//         System.out.println(result);
//     }
    
// }

public class B_search {

    public static int binary_search(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < key) {
                left = mid + 1;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                return mid; // key found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 6, 2, 1, 4, 56, 3, 66};
        
        Arrays.sort(arr); // sort once before searching
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int x = 5;
        int result = binary_search(arr, x);

        if (result == -1) {
            System.out.println(x + " not found");
        } else {
            System.out.println(x + " found at index " + result);
        }
    }
}
