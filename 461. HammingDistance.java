//461. HammingDistance.java
/*Bitwise operation
Review x^y -> exclusive or
x|y, x&y, ~negate, x << y(left shift always0), x >> y(right shift MSB same)
*/

// Mine
// class Solution {
//     public int hammingDistance(int x, int y) {
//         int z = x^y; //the 1s are all bits that're different
//         return Integer.bitCount(z);
//     }
// }

//Solution: Integer.bitCount in bitwise

class Solution {
    public int hammingDistance(int x, int y) {
        int z = x^y; //the 1s are all bits that're different
        int result = 0;
        while (z != 0){
            result += z & 1;//see if last bit is 1
            z = z >> 1; // right shift MSB 0s
        }
        return result;
    }
}