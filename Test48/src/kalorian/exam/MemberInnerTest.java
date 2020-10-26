package kalorian.exam;

/**
 * description:
 * author:
 * time:2020/10/16
 */
public class MemberInnerTest {

    public static void main(String[] args) {
        MemberInnerTest memberInnerTest=new MemberInnerTest();
        MemberInner memberInner = memberInnerTest.new MemberInner();
        memberInner.test1();
        memberInner.test2();
    }

    private int a=1;
    public int b=2;

    public void test1(){
        System.out.println("This is Outer test1");
    }

    class MemberInner{
        int a=2;
        private int b=1;

        public void test1(){
            System.out.println("This is Inner test1");
        }

        public void test2(){
            System.out.println(MemberInnerTest.this.a);
        }

    }
}
