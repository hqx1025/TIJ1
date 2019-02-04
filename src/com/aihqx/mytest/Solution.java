package com.aihqx.mytest;

import java.util.Arrays;

/**
 * @author huqingxiang
 * @date 2018/6/8 2:42 PM
 */
class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(new int[]{2,7,11,15},9)));
    }

    public int[] twoSum(int[] nums, int target) {
    /** 
    * @Description:  
    * @Param: [nums, target]
    * @Exception: 
    * @return: int[]
    * @Author: huqingxiang
    * @Date: 2019-01-04 
    */
        int[] result = new int[2];
        for(int i = 0;i<nums.length-1;i++){
            for(int k =i+1;k<nums.length;k++){
                if(nums[i]+nums[k]==target){
                    result[0] = i;
                    result[1] = k;
                }
            }
        }
        return result;
    }
}