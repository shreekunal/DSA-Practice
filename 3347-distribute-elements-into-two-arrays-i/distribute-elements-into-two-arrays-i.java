class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        arr1[0] = nums[0];
        int l1 = 0;

        int[] arr2 = new int[n];
        arr2[0] = nums[1];
        int l2 = 0;
        
        for (int i = 2; i < n; i++){
            if(arr1[l1]>arr2[l2]){
                l1++;
                arr1[l1] = nums[i];
            } else {
                l2++;
                arr2[l2] = nums[i];
            }
        }
        
        n=0;
        for(int i = 0; i <= l1; i++){
            if(arr1[i]==0) break;
            nums[n++] = arr1[i];
        }
        for(int i = 0; i <= l2; i++){
            if(arr2[i]==0) break;
            nums[n++] = arr2[i];
        }
        return nums;
    }
}