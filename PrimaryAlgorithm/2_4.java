class Solution {
    public boolean isAnagram(String s, String t) {
    int[] flags = new int[26];
    if(s.length()!=t.length()){
        return false;
    }
    for(int i = 0;i<s.length();i++){
        flags[s.charAt(i)-'a']++;
    }
    
    for(int j =0;j<t.length();j++){
        if(--flags[t.charAt(j)-'a'] <0){
            return false;
        }
    }
    return true;
    }
}
