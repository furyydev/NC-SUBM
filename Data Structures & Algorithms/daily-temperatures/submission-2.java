class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // pair: [temp, index]

        for(int i = 0; i < temperatures.length; i++){
            int temp = temperatures[i];
            while(!stack.isEmpty() && temp > stack.peek()[0]){
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];

            }
            stack.push(new int[]{temp, i});
        }
        return res;
    }
} // Brain Dead

// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         Stack<Integer> st1 = new Stack<>();
//         Stack<Integer> st2 = new Stack<>();
//         int output[] = new int[temperatures.length];
//         int res = 0;
//         for (int i = 0; i<temperatures.length; i++) {
//             int temp = temperatures[i];
//             st1.push(temp);
//             st2.push(temp);
//             int j = 0;
//             while(j<temperatures.length){
//                 int temp2 = temperatures[j];
//                 if(temp2>temp){
//                     res = j - i;
//                     output[i] = res;
//                     j++;
//                     break;
//                 }
//                 else{
//                     j++;
//                 }
//             }
//             j = i;
//         }
//         return output;
//     }
// }