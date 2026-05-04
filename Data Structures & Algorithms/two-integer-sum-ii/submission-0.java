class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i<j) {
            int sum = numbers[i] + numbers[j];
            if(sum > target){
                j--;
            }else if(sum < target){
                i++;
            }else{
                int[] arr = new int[]{numbers[i], numbers[j]};
                return arr;
            }
        }
        return null;
    }
}
