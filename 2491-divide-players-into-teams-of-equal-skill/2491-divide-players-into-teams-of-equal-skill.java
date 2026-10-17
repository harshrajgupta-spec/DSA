class Solution {
    public long dividePlayers(int[] skill) {
         Arrays.sort(skill);
         long sum=skill[0]+skill[skill.length-1];
         long prodSum=0;
         int i=0;
         int j=skill.length-1;
        while(i<j){
            long currSum=skill[i]+skill[j];
            if(sum==currSum){
                prodSum+=skill[i]*skill[j];
                i++;
                j--;
            }
            else{
                return -1;
            }
        }
        return prodSum;
    }
}