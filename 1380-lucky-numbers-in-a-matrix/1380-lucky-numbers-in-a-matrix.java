class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        int val=Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                val=Math.min(val, matrix[i][j]);
            }
            set.add(val);
            val=Integer.MAX_VALUE;
        }
        val=0;
         for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                val=Math.max(val, matrix[j][i]);
            }
            if(set.contains(val)){
                list.add(val);
            }
            val=0;
        }
        return list;
    }
}
