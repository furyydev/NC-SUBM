class Solution {
    public int search(int[] nums, int target) {
       for(int i = 0; i<nums.length; i++){
        if(nums[i] == target){
            return i;
        }
       } 
       return -1;
    }
}

// class Solution {
//     public int search(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;
//         int res = 0;

//         while (left < right) {
//             int mid = left + (right - left) / 2;
//             if (nums[mid] < nums[right]) {
//                 right = mid
//             } else {
//                 left = mid + 1;
//             }
//         }
//         while(left < )


//         return -1;
//     }
// }
