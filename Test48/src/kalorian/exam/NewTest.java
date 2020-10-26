package kalorian.exam;

import java.util.Calendar;

import static java.util.Calendar.MONTH;

/**
 * description:
 * author:
 * time:2020/10/17
 */
public class NewTest {

    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();
        time.set(Calendar.DAY_OF_MONTH,
                time.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(time.getActualMaximum(Calendar.DAY_OF_MONTH));
    }

    public String exam(String str,int length){
        int bytes=0;
        for(int i=0;i<length;i++){
            if(bytes==length){
                return str.substring(0,i);
            }
            char c=str.charAt(i);
            if(c<256){
                bytes+=1;
            }else{
                bytes+=2;
                if(bytes-length==1){
                    return str.substring(0,i);
                }
            }
        }
        return str;
    }
}
