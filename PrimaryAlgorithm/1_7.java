class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int sum = digits[length-1]+1;
        int carry = sum/10;
        digits[length-1] = sum%10;
    
        for(int i=length-2;i>=0;i--){
            sum = digits[i]+carry;
            digits[i] = sum%10;
            carry = sum/10;

        }
        if (carry == 0){
            return digits;
        }else{
            int[] ans = new int[length+1];
            int index = 0;
            ans[index++]=carry;
            for(int num: digits){
                ans[index++]=num;
            }
            return ans;
        }
    }
}
