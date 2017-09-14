373. SumofTwoInt.java
class Solution {
    public int getSum(int a, int b) {
        //both one then 1
        int sum, carry;
        carry = a & b;
        sum = a ^ b;
        
        while (b != 0){
            carry = a & b;
            sum = a ^ b;
            a = sum;
            b = carry << 1;
        } //a ^ b cal the sum of 0 and 1 , 1 and 1 will be update by recursion and a&b
        return sum;
    }
}