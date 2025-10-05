public class printArray {
    static void printArr(int[] arr,int size,int i){
        
        if (i==size) {
            return ;//base end case
        }
        // if(arr[i] == target){
        //     System.out.print(i+" ");
        // }
         System.out.println(arr[i]+" ");//assending 

         //System.out.println(arr[size-i-1]+" ");//desending
        printArr(arr, size,++i);
       

    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7};
        
        int size = arr.length,i=0;
        printArr(arr,size,i);
        
    }
}
