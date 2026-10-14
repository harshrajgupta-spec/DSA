class Solution {
    public List<Integer> prime(int n){
        int[] arr=new int[n+1];
        List<Integer> list=new ArrayList<>();
        for(int i=2; i<=n/i; i++){
             if(arr[i]==0){
            for(int j=i*i; j<=n; j+=i){
               arr[j]=1;  
            }
          }
        }
        for(int i=2; i<=n; i++){
            if(arr[i]==0){
                list.add(i);
            }
        }
        return list;
    }
    public List<Integer> maxPrimes(int n, int s) {
        if(s<=1){
            return new ArrayList<>();
        }
        List<Integer> list=prime(n);
        List<Integer> ans=new ArrayList<>();
        int sum=0;
        for(int i=0; i<list.size(); i++){
                sum+=list.get(i);
                if(sum>s){
                    break;
                }
                ans.add(list.get(i));
        }
        return ans;
    }
}// 0 1 2 3 4 5 6 7 8 9 10