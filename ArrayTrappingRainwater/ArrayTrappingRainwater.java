import java.util.*;

/*
 * Trapping Rainwater: Given n non-negative integers representing and elevation(height) map where the width of each bar is 1,
 * computer how much water it can trap after raining- Example: height=[4, 2, 0, 6, 3, 2, 5]
 */


public class ArrayTrappingRainwater {
    public static int trappedRainWater(int height[]) {

        // calculate left max boundary - array
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i=0; i<n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);  // calculate min between left max boundary and ight max boundary
            trappedWater += waterLevel-height[i];
        }

        return trappedWater;
        
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int ans = trappedRainWater(height);
        System.out.println(ans);
    }
}
