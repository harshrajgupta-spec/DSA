class Solution {
    public String[] findWords(String[] words) {
        String s1="qwertyuiopQWERTYUIOP";
        String s2="asdfghjklASDFGHJKL";
        String s3="zxcvbnmZXCVBNM";
        List<String> list=new ArrayList<>();
        for(String s:words){
            char[] c=s.toCharArray();
            if(s1.indexOf(c[0])>=0){ 
                if(c.length==1){
                    list.add(s);
                }
                for(int i=1; i<c.length; i++){
                    if(s1.indexOf(c[i])<0){
                        break;
                    }
                    if(i==c.length-1 && s1.indexOf(c[i])>=0){
                        list.add(s);
                    }
                }
            }
            else if(s2.indexOf(c[0])>=0){
                if(c.length==1){
                    list.add(s);
                }
                for(int i=1; i<c.length; i++){
                    if(s2.indexOf(c[i])<0){
                        break;
                    }
                    if(i==c.length-1 && s2.indexOf(c[i])>=0){
                        list.add(s);
                    }
                }
            }
            else if(s3.indexOf(c[0])>=0){
                if(c.length==1){
                    list.add(s);
                }
                for(int i=1; i<c.length; i++){
                    if(s3.indexOf(c[i])<0){
                        break;
                    }
                    if(i==c.length-1 && s3.indexOf(c[i])>=0){
                        list.add(s);
                    }
                }
            }
        }
        String[] ss=new String[list.size()];
        for(int i=0; i<ss.length; i++){
            ss[i]=list.get(i);
        }
        return ss;
    }
}