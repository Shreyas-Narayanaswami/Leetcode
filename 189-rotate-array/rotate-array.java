class Solution {
    public void rotate(int[] nums, int k) {
        
 
        int n = nums.length; 
        // Adjust k to handle cases where k > n
        k = k % n; 
        if (n == k) return; 

        // Reverse the first part of the array (from index 0 to n-k-1)
        reverse(nums, 0, n-k-1);

        // Reverse the remaining part of the array (from index n-k to n-1)
        reverse(nums, n-k, n-1);

        // Reverse the entire array to achieve the right rotation
        reverse(nums, 0, n-1);
    }

  
    private void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}
