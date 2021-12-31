class Solution {
    public boolean isPalindrome(String s) {
          int left=0,right=s.length()-1;
      while(left<right){
          char chl = s.charAt(left);
          while(left < right && !Character.isLetterOrDigit(chl)){
            left++;
             chl = s.charAt(left);
          }
          char chr = s.charAt(right);
         while(left<right && !Character.isLetterOrDigit(chr)){
              right--;
              chr = s.charAt(right);
          }
     
          if (left < right){
            if(Character.toLowerCase(chl)!=Character.toLowerCase(chr)){
                return false;
            }else{
                left++;
                right--;
           }
          }
      }
      return true; 
 }
}
