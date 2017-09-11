// 50. Pow(x,n).java 
// ??????
// why logN again? Poly? O() 为什么这个这么快。。 recursion减少计算次数，不然就要n次相乘
class Solution {
    public double myPow(double x, int n) {
        //NOTE: n pos or neg or 0
        if (n == 0) return 1.0;
        if (x == 1.0 || x == -1.0) {
            if (n % 2 == 0) return 1.0;
            else return x;
        }
        double result;
        //pos
        if (n > 0){
            if (n % 2 == 0) {
                result = myPow(x, n/2);
                return result*result;
            }
            else{
                result = myPow(x, n/2);
                return result*result*x;
            }
        }
        //neg
        else{
            if (n == Integer.MIN_VALUE) n += 2;//..keep the even value
            result = 1/myPow(x,-n);//only negate once
            return result;
        }
    }
}