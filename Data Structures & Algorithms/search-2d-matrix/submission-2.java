class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            // 2D to 1D
            int[] arr = matrix[row];

            // Binary Seach Algo
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                // int mid = (left + right) / 2;
                int mid = left + (right - left) / 2;
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
