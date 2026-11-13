class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list=new ArrayList<>();
        String[] s=text.split(" ");
        for(int i=2; i<s.length; i++){
            if(s[i-1].equals(second) && s[i-2].equals(first)){
                list.add(s[i]);
            }
        }
        String[] ss=new String[list.size()];
        for(int i=0; i<list.size(); i++){
            ss[i]=list.get(i);
        }
        return ss;
    }
}