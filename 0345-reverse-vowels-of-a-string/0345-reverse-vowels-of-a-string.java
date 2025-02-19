class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int left = 0, right = arr.length - 1;
        String vow = "AEIOUaeiou";
        while (left < right) {
            while (left < right && vow.indexOf(arr[left]) == -1) {
                left++;
            }
            while (left < right && vow.indexOf(arr[right]) == -1) {
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}