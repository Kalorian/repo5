package kalorian.exam;

/**
 * description:
 * author:
 * time:2020/10/16
 */
public class LocalInnerTest {

    public int a=0;
    public static int b=1;

    public static void test1(){
        class LocalInner{
            int b=0;
            public void visit(){
                System.out.println(LocalInnerTest.b);
            }
        }
        new LocalInner().visit();
    }

    public static void main(String[] args) {
        new LocalInnerTest().test1();
    }
}
