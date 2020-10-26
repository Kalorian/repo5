package kalorian.test;

/**
 * description:
 * author:
 * time:2020/10/14
 */
public class 快速排序法 {

    public static void main(String[] args) {
        int[] a={78,19,46,2,86,23,49,26,41,99,48,12};
        sort(a,0,11);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void sort(int[] a,int low,int high){
        int start=low;
        int end=high;
        int key=a[low];
        while(end>start){
            while(end>start&&a[end]>=key){
                end--;
            }
            if(a[end]<=key){
                int temp=a[end];
                a[end]=a[start];
                a[start]=temp;
            }
            while(end>start&&a[start]<=key){
                start++;
            }
            if(a[start]>=key){
                int temp=a[end];
                a[end]=a[start];
                a[start]=temp;
            }
        }
        if(start>low)
            sort(a,low,start-1);
        if(end<high)
            sort(a,end+1,high);
    }
}
