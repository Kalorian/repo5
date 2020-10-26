package kalorian.test;

import java.util.Arrays;

/**
 * description:
 * author:
 * time:2020/10/14
 */
public class 希尔排序法 {

    public static void main(String[] args) {
//        int[] nums={4,9,7,5,6,1,0,8,2,3,11,12,15,13,14,10};
        int[] nums={7,6,5,4,3,2,1,0};
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void shellSort(int[] a){

        for(int step=a.length/2;step>0;step/=2){
            for(int i=step;i<a.length;i++){
                int value=a[i];
                int j;
                for(j=i-step;j>=0&&a[j]>value;j-=step){
                    a[j+step]=a[j];
                }
                a[j+step]=value;
            }
        }
    }


}
