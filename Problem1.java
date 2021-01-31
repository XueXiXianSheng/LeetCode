/**
 * Author by 学习先生, Email 916516214@qq.com, Date on 2021/1/30.
 * PS: Not easy to write code, please indicate.
 */
public class Problem1 {
}
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{1, 2};
                }
            }
        }
        return new int[]{-1};
    }
}