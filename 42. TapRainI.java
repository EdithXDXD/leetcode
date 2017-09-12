42. TapRainI.java
import java.util.Vector;
class Pos {
        public Pos(){};
        public int left;
        public int right;
}

public class Solution {
    //cal the maxleft and maxright height for one particular pos
    
    public int trap(int[] height) {
        int size = height.length;
        
        if (size == 0) return 0;
        
        Vector<Pos> bars = new Vector<Pos> ();//starts at one and ends at size-1;
        int maxLeft = 0, maxRight = 0, water = 0;
        //cal maxleft edge case -> count left
        for (int i = 1; i < size + 1; ++i) {
            maxLeft = Math.max(maxLeft, height[i - 1]);
            Pos temp = new Pos();
            temp.left = maxLeft;
            bars.add(temp);
        }
        //cal maxRight
        for (int i = size - 1; i > 0; i--) {
            maxRight = Math.max(maxRight, height[i]);
            bars.get(i - 1).right = maxRight;
        }

        //cal num water bar = min(maxLeft,maxRight) - currHeight
        for (int i = 1; i < size - 1; ++i) {
            int barHeight = Math.min(bars.get(i-1).left,bars.get(i-1).right) - height[i];
            if (barHeight < 0) barHeight = 0; // < 0 no water
            water += barHeight;
        }
        return water;
    }
}