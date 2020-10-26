package kalorian.exam;

/**
 * description:
 * author:
 * time:2020/10/16
 */
public class StaticInnerTest {

    public static void main(String[] args) {
        StaticInner staticInner = new StaticInner(9);
        staticInner.test2();
        staticInner.test1();
        StaticInnerTest staticInnerTest = new StaticInnerTest();
        staticInnerTest.test1();
        staticInnerTest.test2();
    }

    int a=1;
    int b=3;

    public static void test1(){
        System.out.println("This is Outer.test1");
    }
    public void test2(){
        System.out.println("This is Outer.test2");
    }

    static class StaticInner{

        public StaticInner(int a) {
            this.a = a;
        }

        public int a=0;
        static int b=5;
        public static void test1(){
            System.out.println("This is Inner.test1");
        }
        public void test2(){
            System.out.println("This is Inner.test2");
        }
        public void test3(){
            StaticInnerTest.test1();
        }
    }
}
