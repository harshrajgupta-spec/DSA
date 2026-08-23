class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int i=0;
        int j=people.length-1;
        while(i<j){
            if(people[i]!=-1 && people[j]!=-1 && people[i]+people[j]>limit){
                people[j]=-1;
                j--;
                count++;
            }
            else if(people[i]!=-1 && people[j]!=-1 && people[i]+people[j]<=limit){
                people[i]=-1;
                people[j]=-1;
                i++;
                j--;
                count++;
            }
        }
        for(int num:people){
            if(num!=-1) count++;
        }
        
        return count;
    }
}