package kalorian.exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * description:
 * author:
 * time:2020/10/19
 */
public class Demo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("输入骰子面数：");
        String index=scanner.nextLine();
        char[] array=new char[Integer.valueOf(index)];
        char count;
        for(int i=0;i<array.length;i++){
            if(i<9){
                count=49;
                for(int j=0;j<i;j++){
                    count++;
                }

            }else {
                count=65;
                for(int j=9;j<i;j++){
                    count++;
                }
            }
            array[i]=count;
        }
        int[] data=new int[array.length];
        System.out.print("输入要骰的次数：");
        String time=scanner.nextLine();
        for(int i=0;i<Integer.valueOf(time);i++){
            int num=(int)(Math.random()*Integer.valueOf(index));
            data[num]++;
        }
        for(int i=0;i<array.length;i++){
            double gen=(1.0000*data[i]/Integer.valueOf(time))*100;
            System.out.println("骰到"+array[i]+"的次数是："+gen+"%");
            System.out.println("?");
        }
    }
}
