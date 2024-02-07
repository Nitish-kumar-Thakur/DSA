package org.example.ArrayArrayList;

import java.util.Arrays;

public class MaxItemInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(Max(arr));
    }
    static int Max(int[] arr){
        int max =arr[0];
        for(int i=1;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
//            System.out.println(max);
        }
        return max;
    }

}
