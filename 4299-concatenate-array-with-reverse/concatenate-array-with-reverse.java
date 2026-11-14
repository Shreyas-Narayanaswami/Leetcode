class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] temp=new int[2*n];
        for (int i=0;i<n;i++){
            temp[i]=nums[i];
            temp[i+n]=nums[n-i-1];
        }
        return temp;
    }
}