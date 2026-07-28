class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];

        // prefix product
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1]*nums[i];
        }

        //postfix product
        int postfix[] = new int[nums.length];
        postfix[nums.length - 1] = nums[nums.length - 1];
        for(int j = nums.length - 2; j >= 0; j-- ){
            postfix[j] = postfix[j + 1] * nums[j];
        }

        // output
        res[0] = postfix[1];
        for(int k = 1; k<nums.length - 1; k++){
            res[k] = prefix[k-1]*postfix[k+1];
        }
        res[nums.length - 1] = prefix[nums.length - 2];
        return res;
    }
}  
