class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=k;
        StringBuilder sb=new StringBuilder();
        List<String> list=new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            sb.append(s.charAt(i));
            if(sb.length()==k){
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        if(sb.length()!=0){
        while(sb.length()<k){
            sb.append(fill);
            if(sb.length()==k){
                list.add(sb.toString());
            }
        }
          }
        String[] ss=new String[list.size()];
        for(int i=0; i<list.size(); i++){
            ss[i]=list.get(i);
        }
        return ss;
    }
}