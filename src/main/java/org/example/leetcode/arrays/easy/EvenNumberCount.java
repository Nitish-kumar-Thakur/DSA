package org.example.leetcode.arrays.easy;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNumberCount {
    public static void main(String[] args) {
        int[] arr={12,12354,25,1,25,654,356478};
        System.out.println(findNumbers(arr));

    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int x:nums) {
            if (even(x)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }

}
