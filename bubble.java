public  class bubble {
    static void bubblesort(int[] arr){
        int n = arr.length;
        int temp;
        for(int i = 0 ; i < n-1; i++){
            for (int j = 0; j < n - i -1; j++) {
            if(arr[j] > arr[j +1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
           }
        }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
   
    public static void main(String[] args) {
        int [] arr ={7,4,9,2,8,1};
        bubblesort(arr);
    }
}
