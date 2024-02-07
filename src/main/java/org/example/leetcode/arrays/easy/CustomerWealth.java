package org.example.leetcode.arrays.easy;

//https://leetcode.com/problems/richest-customer-wealth/
public class CustomerWealth {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{3,2,1},{1,2,3,4,5}};
        System.out.println(maximumWealth(arr));

    }
    public static int maximumWealth(int[][] accounts) {
        int total=0;
        for(int[] x:accounts){
            int account = singleAccount(x);
            if(total<account){
                total=account;
            }
        }
        return total;
    }
    static int singleAccount(int[] account){
        int total=0;
        for(int x:account){
            total+=x;
        }
        return total;
    }
}
