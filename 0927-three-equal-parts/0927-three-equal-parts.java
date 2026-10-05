class Solution {
    public int[] threeEqualParts(int[] arr) {
        int ones=0;
        int[] parts=new int[2];
        parts[0]=-1;
        parts[1]=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                ones++;
            }
        }
         if (ones == 0) {
            return new int[]{0, arr.length - 1}; 
        }
        if(ones%3!=0){
            return parts;
        }
        int idx1=-1;
        int idx2=-1;
        int idx3=-1;
        int numOnes=ones/3;
        ones=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                ones++;
                if(ones==numOnes+1){
                    idx2=i;
                }
                else if(ones==numOnes*2+1){
                    idx3=i;
                }
                else if(ones==1){
                    idx1=i;
                }
            }
        }
        while(idx3<arr.length){
            if(arr[idx3]==arr[idx1] && arr[idx3]==arr[idx2]){
                idx1++;
                idx2++;
                idx3++;
            }
            else{
                return parts;
            }
        }
        return new int[]{idx1-1, idx2};
    }
}