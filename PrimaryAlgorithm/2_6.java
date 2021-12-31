class Solution {
    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int index = 0;
        int sign=1;
        int result=0;

        while(index < length && chars[index] == ' ')
            index++;
        if(index >=length)
            return 0;

        if(chars[index]=='-'){
            sign = -1;
            index++;
        }else if(chars[index]=='+'){
            sign = 1;
            index++;
        }
        
        while(index < length && chars[index] >= '0' && chars[index] <= '9'){
            int num = chars[index] - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            else
                result = result * 10 + num;
            index++;
        }
        return result * sign;

    }
}
