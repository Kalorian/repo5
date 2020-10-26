package kalorian.test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * description:
 * author:
 * time:2020/10/13
 */
public class Test {

    public static void main(String[] args) {
        int[] nums={4,9,7,5,6,1,0,8,2,3,11,12,15,13,14,10};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] array,int low,int high){
        int mid=(low+high)/2;
        if(low<high){
            sort(array,low,mid);
            sort(array,mid+1,high);
            merge(array,low,mid,high);
        }
    }

    public static void merge(int[] array,int low,int mid,int high){
        int[] temp=new int[high-low+1];

        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=high){
            if(array[i]<=array[j]){
                temp[k++]=array[i++];
            }else {
                temp[k++]=array[j++];
            }
        }
        while(i<=mid){
            temp[k++]=array[i++];
        }
        while(j<=high){
            temp[k++]=array[j++];
        }
        for(int l=0;l<temp.length;l++){
            array[low+l]=temp[l];
        }
    }
}
