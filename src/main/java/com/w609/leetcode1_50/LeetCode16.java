package com.w609.leetcode1_50;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
 * 使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class LeetCode16 {

    public int threeSumClosest(int[] nums, int target) {
        if(nums==null||nums.length<3){
            return 0;
        }

        int result=nums[0]+nums[1]+nums[2];
        int dis=Math.abs(result-target);
        for(int i=0;i<nums.length-2;i++){
            for (int j=i+1;j<nums.length-1;j++){
                for (int k=j+1;k<nums.length;k++){
                    if(k==2){
                        continue;
                    }
                    int result_temp=nums[i]+nums[j]+nums[k];
                    int dis_temp=Math.abs(result_temp-target);
                    if(dis_temp==0){
                        return result_temp;
                    }
                    if(dis_temp<dis){
                        result=result_temp;
                        dis=dis_temp;
                    }


                }
            }

        }
        return  result;
    }
}
