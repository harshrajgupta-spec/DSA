class Solution {
    public int minDeletion(String s, int k) {
        int[] arr=new int[26];
        Set<Character> set=new HashSet<>();
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
            set.add(s.charAt(i));
        }
        Arrays.sort(arr);
       int d=set.size()-k;
       int sum=0;
       if(d<=0)return 0;
       for(int i=0; i<arr.length; i++){
          if(arr[i]!=0 && d>0){
              sum+=arr[i];  
              d--;
          }
       }
       return sum;
    }
}