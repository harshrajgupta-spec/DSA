class Solution {
    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public int countVowelSubstrings(String word) {
        if(word.length()<5){
            return 0;
        }
           Set<Character> set=new HashSet<>();
           int count=0;
           for(int i=0; i<word.length()-4; i++){
              set.clear();
              for(int j=i; j<word.length(); j++){
                  if(isVowel(word.charAt(j))){
                      set.add(word.charAt(j));
                      if(set.size()==5){
                          count++;
                        }
                  }
                  else{
                    break;
                  }
              }
           }
           return count;
    }
}