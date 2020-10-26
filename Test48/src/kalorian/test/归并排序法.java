package kalorian.test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * description:
 * author:
 * time:2020/10/13
 */
public class 归并排序法 {

    public static void main(String[] args) {
        int[] nums={4,9,7,5,6,1,0,8,2,3,11,12,15,13,14,10};
        归并排序法.sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums,int low,int high){
        int mid=(low+high)/2;
        if(low<high){
            sort(nums,low,mid);
            sort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }

    public static void merge(int[] nums,int low,int mid,int high){
        int[] temp=new int[high-low+1];
//        System.out.println("这一次参与排列的数有"+temp.length+"个");
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=high){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }else {
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=high){
            temp[k++]=nums[j++];
        }
        for(int k2=0;k2<temp.length;k2++){
            nums[k2+low]=temp[k2];
        }
    }
}
