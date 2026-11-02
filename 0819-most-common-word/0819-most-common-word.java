class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        String cleaned = paragraph.replaceAll("[!?',;\\.]", " ");
        String[] words = cleaned.trim().split(" ");
        for(String ban:banned){
            set.add(ban);
        }
        int max=0;
        StringBuilder sb=new StringBuilder();
        for(String w:words){
            String word=w.toLowerCase();
           if(set.contains(word) || word.equals(""))continue;
           map.put(word, map.getOrDefault(word, 0)+1);
           if(map.get(word)>max){
               max=map.get(word);
               sb.setLength(0);
               sb.append(word);
           }
        }
        return sb.toString();
    }
}