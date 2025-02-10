class Solution {
    public int getWinner(int[] arr, int k) {
        int winner = arr[0];
        int strk = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > winner){
                strk = 1;
                winner = arr[i];
            } else strk++;
            if(strk == k) return winner;
        }   
        return winner;
    }
}