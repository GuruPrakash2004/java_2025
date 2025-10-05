public class Secondargest {
    public static int secondLargestElement(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1; // Not enough elements
        }

        int large = nums[0];
        int slarge = Integer.MIN_VALUE; // works for negative numbers too

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > large) {
                slarge = large;
                large = nums[i];
            } else if (nums[i] < large && nums[i] > slarge) {
                slarge = nums[i]; // ✅ added semicolon
            }
        }

        return (slarge == Integer.MIN_VALUE) ? -1 : slarge; // handles cases with all equal elements
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        System.out.println(secondLargestElement(arr)); // Output: 45
    }
}
