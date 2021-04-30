public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int volume = Math.min(height[left], height[right]) * (right - left);

        while (left < right){
            volume = Math.max(volume, Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]){
                left = left + 1;
            }
            else{
                right = right - 1;
            }
        }

        return volume;
    }
}
