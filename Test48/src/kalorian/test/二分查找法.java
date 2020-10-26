package kalorian.test;

/**
 * description:
 * author:
 * time:2020/10/11
 */
public class 二分查找法 {

    public static void main(String[] args) {
//        二分查找法 test=new 二分查找法();
        int[] a=new int[100];
        for(int i=0;i<a.length;i++){
            a[i]=2*i;
        }
        System.out.println(search_ErFen(a,18));

    }

    public static String search_ErFen(int[] array,int a){
        int head,tail,mid;
        head=0;
        tail=array.length-1;
        while(head<=tail){
            mid=(head+tail)/2;
            System.out.println("mid现在为"+mid);
            if(array[mid]==a){
                return "是数组中的第"+(mid+1)+"个元素";
            }else if(array[mid]>a){
                tail=mid-1;
                System.out.println("array[mid]"+array[mid]+"大了，往左边找，tail改为"+tail);
            }else {
                head=mid+1;
                System.out.println("mid"+array[mid]+"小了，往右边找，head改为"+head);
            }
        }
        return "找不到该元素";
    }



}
