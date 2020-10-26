package kalorian.test;

/**
 * description:
 * author:
 * time:2020/10/14
 */
public class 插入排序法 {

    public static void main(String[] args){
        int[] a={78,19,46,2,86,23,49,26,41,99,48,12};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int insertVal=arr[i];
            int index=i-1;
            while(index>=0&&insertVal<arr[index]){
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1]=insertVal;
        }
    }
}
