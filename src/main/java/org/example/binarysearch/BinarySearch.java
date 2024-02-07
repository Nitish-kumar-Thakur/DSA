package org.example.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-2,-1,0,2,4,6,9,11,12,14,20,36,48}; // sorted array in ascending order
        int[] arr2={48,36,20,14,12,11,9,6,4,2,0,-1,-2}; // sorted array in descending order
        int target=36;
        System.out.println(ascendingSearch(arr,target));
        System.out.println(descendingSearch(arr2,target));
    }

    static int ascendingSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        int first=0;
        int last=arr.length-1;
        while(first<=last){
            int mid=midIndex(first,last);
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                first=mid+1;
            }
            else if(arr[mid]>target){
                last=mid-1;
            }
        }
        return -1;
    }
    static int descendingSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        int first=0;
        int last=arr.length-1;
        while(first<=last){
            int mid=midIndex(first,last);
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                last=mid-1;
            }
            else if(arr[mid]>target){
                first=mid+1;
            }
        }
        return -1;
    }
    static int midIndex(int first, int last){
        return first+(last-first)/2;
    }
}
