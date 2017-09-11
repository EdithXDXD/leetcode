//458. PoorPigs.java
/*two pigs can test up to 5*5 (lower[60/15] + 1 <- if the pig doesnt die in previous rows,
the poison is in the last row) 3 pigs -> 5^3 .....
*/

class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int poorPigs = 0;
        //int/int gives floor (same with Math.floor())
        while (Math.pow(minutesToTest/minutesToDie + 1, poorPigs) < buckets){
            poorPigs ++;
        }
        return poorPigs;
    }
}

//主要要考虑到怎么杀猪最实惠。。才能写出这个。。