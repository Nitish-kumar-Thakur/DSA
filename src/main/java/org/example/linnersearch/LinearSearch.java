package org.example.linnersearch;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        int[][] arr2d={{1,2,3,4,5},{6,7,8,9},{10,11,12,13,14,15}};
//        System.out.println(maxSearch(arr,1,3));
        System.out.println(Arrays.toString(search2D(arr2d,7)));
    }
    static int search(int[] x,int target){
        if(x.length==0){
            return -1;
        }
        for(int index =0;index<x.length;index++){
            if(x[index]==target){
                return index;
            }
        }
        return -1;
    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int index =start;index<=end;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
    static int minSearch(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp>arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
    static int minSearch(int[] arr, int start, int end){
        if(arr.length==0){
            return -1;
        }
        int temp=arr[start];
        for(int i=start+1;i<=end;i++){
            if(temp>arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
    static int maxSearch(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
    static int maxSearch(int[] arr, int start, int end){
        if(arr.length==0){
            return -1;
        }
        int temp=arr[start];
        for(int i=start+1;i<=end;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
    static int[] search2D(int[][] arr, int target){
        if(arr.length==0){
            return new int[] {-1,-1};
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

}
