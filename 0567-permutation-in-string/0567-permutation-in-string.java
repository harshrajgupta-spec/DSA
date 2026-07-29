class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        Map<Character, Integer> map1=new HashMap<>();
        Map<Character, Integer> map2=new HashMap<>();
        for(char c:s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        int low=0;
        int high=s1.length()-1;

        for(int i=0; i<high; i++){
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);
        }
        for(int j=high; j<s2.length(); j++){
            map2.put(s2.charAt(j), map2.getOrDefault(s2.charAt(j), 0)+1);
           
             if (j - low + 1 > s1.length()) {
                char left = s2.charAt(low);
                map2.put(left, map2.get(left) - 1);
                if (map2.get(left) == 0) {
                    map2.remove(left);
                }
                low++;
            }
            if(map1.equals(map2)){
                return true;
            }

        }
        return false;
    }
}