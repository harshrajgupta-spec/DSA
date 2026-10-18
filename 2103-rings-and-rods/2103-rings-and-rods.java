class Solution {
    public int countPoints(String rings) {
        int[] blue=new int[10];
        int[] red=new int[10];
        int[] green=new int[10];
        int count=0;
        
        for(int i=1; i<rings.length(); i+=2){
            if(rings.charAt(i-1)=='B'){
                blue[rings.charAt(i)-'0']++;
            }
            else if(rings.charAt(i-1)=='G'){
                green[rings.charAt(i)-'0']++;
            }
            else{
                red[rings.charAt(i)-'0']++;
            }
        }
        for(int j=0; j<10; j++){
            if(blue[j]>0 && green[j]>0 && red[j]>0){
                count++;
            }
        }
        return count;
    }
}