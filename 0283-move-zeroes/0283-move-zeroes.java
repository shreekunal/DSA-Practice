class Solution {
    // public void moveZeroes(int[] nums) {
    //   int index = 0;
    //     for (int num : nums) {
    //         if (num != 0) nums[index++] = num;
    //     }
    //     for (int i =index ; i < nums.length; i++) {
    //         nums[i] = 0;
    //     }  
    // }
    public static void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }   
}