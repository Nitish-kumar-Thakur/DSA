package org.example.leetcode.arrays.easy;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] num={2,5,5,11};
        System.out.println(Arrays.toString(find(num, 10)));
        System.out.println(Arrays.toString(find2(num,10)));
    }
    static int[] find(int[] nums,int target){
        int[] finds={-1,-1};
        for(int i=0;i<nums.length;i++){
            int j=1;
            while(j<nums.length){
                if((i!=j)&&(nums[i]+nums[j]==target)){
                    finds[0]=i;
                    finds[1]=j;
                    return finds;
                }
                j++;
            }
        }
        return finds;
    }
    static int[] find2(int[] nums, int target){
        int[] find ={0,0};
        for(int i=0;i<nums.length;i++){
            for(int j=1;j< nums.length;j++){
                if((i!=j)&&(nums[i]+nums[j]==target)){
                    find[0]=i;
                    find[1]=j;
                    return find;
                }
            }
        }
        return find;
    }
}
