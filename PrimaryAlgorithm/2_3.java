class Solution {
    public int firstUniqChar(String s) {
     int[] flag = new int[26];
     
     for(int i = 0; i<s.length();i++){
         int numc = s.charAt(i)-'a'; 
         flag[numc]++;
         
     }
     for(int i=0;i<s.length();i++){
         if(flag[s.charAt(i)-'a']==1){
             return i;
         }
     }
     return -1;
    }
}
