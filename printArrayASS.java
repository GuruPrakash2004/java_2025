public class printArrayASS {
    static boolean printArr(int[] arr,int size,int i,int target){
        
        if (i==size) {
            return false;
        }

          if(arr[i] == target){
            System.out.print(i+" ");
            return true;
        }
       
        return printArr(arr, size,i+1,target);
       // System.out.print(arr[i]+" ");
      

    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,5};
        int target = 5;
        int size = arr.length,i=0;
        printArr(arr,size,i,target);
        
    }
}
