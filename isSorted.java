public class isSorted {
    public static boolean sortedArr(int[] nums){
        int n = nums.length;

        for(int i = 1; i < n; i++){
            if (nums[i] < nums[i-1]) {
                return   false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr =  {1,2,3,3,4,5,6,6};
        System.out.println(sortedArr(arr));
    
    }
}
