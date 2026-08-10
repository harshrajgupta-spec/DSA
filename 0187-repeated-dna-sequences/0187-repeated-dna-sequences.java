class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<=10){
            return new ArrayList<>();
        }
        int rep=0;
        Map<Character, Integer> map=new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);

        Set<Integer> seen=new HashSet<>();
        Set<String> res=new HashSet<>();
        int k=10;
        for(int i=0; i<k; i++){
            rep = rep * 4 + map.get(s.charAt(i));
        }
        seen.add(rep);
        for(int j=k; j<s.length(); j++){
            rep=rep-((int)Math.pow(4, k-1)*map.get(s.charAt(j-k)));
            rep*=4;
            rep+=map.get(s.charAt(j));
            if(seen.contains(rep)){
                res.add(s.substring(j-k+1, j+1));
            }
            seen.add(rep);
        }
        return new ArrayList<String>(res);
    }
}