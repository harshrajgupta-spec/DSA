class Solution {
    public boolean isValid(String sub, int maxLetters){
           Set<Character> set=new HashSet<>();
           for(char c:sub.toCharArray()){
               set.add(c);
           }
           return set.size()<=maxLetters;
    }
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
          Map<String, Integer> map=new HashMap<>();
          int max=0;
          for(int i=0; i<s.length()-minSize+1; i++){
              String sub=s.substring(i, i+minSize);
              if(isValid(sub, maxLetters)){
                  map.put(sub, map.getOrDefault(sub, 0)+1);
                  max=Math.max(max, map.get(sub));
              }
          }
          return max;
    }
}