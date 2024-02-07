package org.example.binarysearch;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        int[] arr={-2,-1,0,2,4,6,9,11,12,14,20,36,48}; // sorted array in ascending order
        int[] arr2={48,36,20,14,12,11,9,6,4,2,0,-1,-2}; // sorted array in descending order
        int target=36;
        System.out.println(orderAgnosticBs(arr,target));
    }
    static int orderAgnosticBs(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int first=0;
        int last=arr.length-1;
//      to check array is ascending order or descending order
        boolean isAsc= arr[first]<arr[last];

        while(first<=last){
            int mid=first+(last-first)/2;
            if(arr[mid]==target){
                return mid;
            }
            // if ascending run this
            else if (isAsc) {
                if (arr[mid]<target) {
                    first=mid+1;
                }
                else if(arr[mid]>target){
                    last=mid-1;
                }
            }
            // if descending run this
            else{
                if (arr[mid]<target) {
                    last=mid-1;
                }
                else if(arr[mid]>target){
                    first=mid+1;
                }
            }

        }
        return -1;
    }
}
