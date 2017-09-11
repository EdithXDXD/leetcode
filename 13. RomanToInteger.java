//13. RomanToInteger.java

//一万个if else。。。我总觉得我这算hard code？？
//注意如果-= 100 之后不能再+= 76%
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); ++i){
            char n = s.charAt(i);
            switch(n){
                case 'I':
                    if (i+1 < s.length() && s.charAt(i+1)!='I') result -= 1;
                    else result += 1;
                    break;
                case 'V':
                    if (i+1 < s.length() && 
                        s.charAt(i+1)!='V'
                        &&s.charAt(i+1)!='I') result -= 5;
                    else result += 5;
                    break;
                case 'X':
                    if (i+1 < s.length() && 
                        s.charAt(i+1)!='I'&& 
                        s.charAt(i+1)!='V' &&
                       s.charAt(i+1)!='X' ) result -= 10;
                    else result += 10;
                    break;
                case 'L':
                    if (i+1 < s.length() && 
                        s.charAt(i+1)!='I'&& 
                        s.charAt(i+1)!='V' &&
                       s.charAt(i+1)!='X' && s.charAt(i+1) != 'L' ) result -= 50;
                    else result += 50;
                    break;
                case 'C':
                    if (i+1 < s.length()){ 
                        if( s.charAt(i+1) == 'D' || s.charAt(i+1)=='M' ) result -= 100; 
                        else result += 100;
                    }
                    else{
                        result += 100;
                    }
                    break;
                case 'D':
                    if (i+1 < s.length()){
                        if (s.charAt(i+1) == 'M') result -= 500;
                        else result += 500;
                    }
                    else result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:

            }
        }
        return result;
    }
}
