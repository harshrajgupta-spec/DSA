class Solution {
    public boolean freqCheck(int[] arr1, int[] arr2){
            for(int i=0; i<26; i++){
                if(arr1[i]>arr2[i]){
                    return false;
                }
            }
            return true;
    }
    public String shortestCompletingWord(String licensePlate, String[] words) {
           int[] arr1=new int[26];
           

           for(int i=0; i<licensePlate.length(); i++){
              if(Character.isDigit(licensePlate.charAt(i)) || licensePlate.charAt(i)==' ')continue;
              arr1[(Character.toLowerCase(licensePlate.charAt(i)))-'a']++;  
           }
           String ans="";
           for(int j=0; j<words.length; j++){
               int[] arr2=new int[26];
               String s=words[j];
                for(int k=0; k<s.length(); k++){
                    arr2[s.charAt(k)-'a']++;
                }
                if(freqCheck(arr1, arr2)){
                    if(ans.isEmpty() || s.length()<ans.length()){
                        ans=s;
                    }
                }
           }
           return ans;
    }
}