public class printArrayDES {
    static int printArr(int[] arr,int size,int i,int target){
        
        if (i==size) {
            return -1;//base end case
        }
        
        int value =  printArr(arr, size,i+1,target);
        if(value != -1){
            return value;//get deeper in the array
        }

        if(arr[i] == target){
            return i;//return the index of the target value 
        }
        return -1;//valuse not found
    
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,5};
        int target = 5;
        int size = arr.length,i=0;
        System.out.println(printArr(arr,size,i,target));
        
    }
}


