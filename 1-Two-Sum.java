class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
    return new int[]{};
    }
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = {4, 3, 7, 8, 10, 12, 20};
        int target = 20;
        int[] ans = s.twoSum(nums, target);
        System.out.println("[" + ans[0] + "," + ans[1] + "]");
    }
}