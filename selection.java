public class selection 
{
    static void sel_sort(int arr[]){
        int n = arr.length;
        int min_inx,temp ;
        for(int i = 0; i< n; i++ ){
            min_inx =i;
            for(int j =i+1;j < n; j++){
                if(arr[j] < arr[min_inx]){
                    min_inx = j;
                }
                temp = arr[i];
                arr[i] =arr[min_inx];
                arr[min_inx]= temp;
                
            }
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,9,2,8,1};
        sel_sort(arr);


    }
}
