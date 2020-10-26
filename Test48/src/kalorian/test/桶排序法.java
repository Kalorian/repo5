package kalorian.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * description:
 * author:
 * time:2020/10/13
 */
public class 桶排序法 {

    ArrayList<ArrayList<Integer>> bucketArr;

    public static void main(String[] args) {

        桶排序法 a=new 桶排序法();
        int[] arr={100,7956,2131,9359,-5463,-6136,-79562,3123,9656};
        a.bucketSort(arr);
        a.print(a.bucketArr);

    }

    public void bucketSort(int[] arr){

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        int bucketNum=(max-min)/arr.length+1;
        bucketArr=new ArrayList<>(bucketNum);
        for(int i=0;i<bucketNum;i++){
            bucketArr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<arr.length;i++){
            int num=(arr[i]-min)/(arr.length);
            bucketArr.get(num).add(arr[i]);
        }
        for(int i=0;i<bucketArr.size();i++){
            Collections.sort(bucketArr.get(i));
        }
    }

    public void print(ArrayList<ArrayList<Integer>> arrayList){

        System.out.print("[");
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i).size()!=0&&i!=arrayList.size()-1){
                for(int j=0;j<arrayList.get(i).size();j++){
                    System.out.print(arrayList.get(i).get(j));
                    System.out.print(",");
                }
            }
        }
        for(int i=0;i<arrayList.get(arrayList.size()-1).size();i++){
            System.out.print(arrayList.get(arrayList.size()-1).get(i));
            if(i!=arrayList.get(arrayList.size()-1).size()-1){

                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
