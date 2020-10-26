package kalorian.exam;

/**
 * description:
 * author:
 * time:2020/10/16
 */
public class A {

    int a=1;
    double d=2.0;

    void show(){
        System.out.println("Class A: a="+a +"\td="+d);
    }

    public static void main(String[] args) {
        A b=new B();
        b.show();
    }
}

class B extends A{
    float a=3.0f;
    String d="Java program.";
    void show(){
//        super.show( );
        System.out.println("Class B: a="+a +"\td="+d);
    }
}
