class Solution {
    public int partitionString(String s) {
        int result=1;
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                result++;
                set.clear();
            }
            set.add(c);
        }
        return result;
    }
}