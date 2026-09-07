class Solution {
    public int getLucky(String s, int k) {
        int num = 0;

        for (char c : s.toCharArray()) {
            int value = c - 'a' + 1;

            num += value / 10;
            num += value % 10;
        }

        while (k > 1) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
            k--;
        }

        return num;
    }
}