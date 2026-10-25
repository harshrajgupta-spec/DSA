class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        if(strs[0].length()==1){
            for(int i=1; i<strs.length; i++){
                if(strs[i].charAt(0)<strs[i-1].charAt(0)){
                    return 1;
                }
            }
            return 0;
        }
        
        for(int i=0; i<strs[0].length(); i++){
            for(int j=1; j<strs.length; j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){ 
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}