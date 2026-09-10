class Solution {
    public boolean judgeCircle(String moves) {
        int right=0;
        int left=0;
        int up=0;
        int down=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                up++;
            }
            else if(c=='D'){
                down++;
            }
            else if(c=='R'){
                right++;
            }
            else if(c=='L'){
                left++;
            }
        }
        return right-left==0 && up-down==0;
    }
}