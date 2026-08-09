class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            int[] arr = matrix[row];

            // Binary Seach Algoo
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                // int mid = (left + right) / 2;
                int mid = left + (right - left) / 2;
                // passes test cases with large values 
                if (target > arr[mid]) {
                    left = mid + 1;
                } else if (target < arr[mid]) {
                    right = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
