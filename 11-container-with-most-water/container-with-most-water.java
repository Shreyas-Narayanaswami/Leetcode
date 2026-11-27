class Solution {
    public int maxArea(int[] height) {
        int maxAreaNum=0;
        int left =0;
        int right=height.length-1;

        while(left<right){
            int minHeight =Math.min(height[left],height[right]);
            int width=right-left;
            int area=minHeight*width;
            maxAreaNum=Math.max(maxAreaNum,area);
            if (height[left]<=height[right]) left++;
            else right --;

        }
        return maxAreaNum;
    }
}