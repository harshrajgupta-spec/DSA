class Solution {
    public int longestBeautifulSubstring(String word) {
        Set<Character> set=new HashSet<>();
        int len=0;
        int low=0;
        set.add(word.charAt(0));
        for(int high=1; high<word.length(); high++){
            if(word.charAt(high-1)>word.charAt(high)){
                 set=new HashSet<>();
                 low=high;
            }
            set.add(word.charAt(high));
            if(set.size()==5){
                len=Math.max(len, high-low+1);
            }
        }
        return len;
    }
}