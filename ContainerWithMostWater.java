import java.util.*;
import java.lang.Math;
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int h,l;
        int left=0;
        int right = height.length-1;
        // int temp = 0;
        int max = 0;
        while(left < right){
            h = Math.min(height[left] , height[right]);
            l = right-left;
            // temp = ;
            max = Math.max(h*l, max);
            if(height[left] <= height[right] ){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}




