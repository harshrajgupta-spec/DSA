class Solution {
    public int fillCups(int[] amount) {
        int sum=amount[0]+amount[1]+amount[2];
        Arrays.sort(amount);
        return Math.max(amount[2], (sum+1)/2);
    }
}