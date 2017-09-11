//292. NimGame.java
/*Only way to lose is to have a 4 multiple
    Shindler上课讲过。。饼干毒死人的故事
*/
class Solution {
    public boolean canWinNim(int n) {
        if(n % 4 == 0) return false;
        else return true;
    }
}