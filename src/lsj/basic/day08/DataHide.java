package lsj.basic.day08;

public class DataHide {
    public static void main(String[] args) {
        // capsulation
        // principal that user should hide the information
        // which is not essential

        // Access Modifier
        // provide data hide function when
        // declare class, member variable, and method
        // private > default > protected > public
        A one = new A();
        System.out.println(one.c);
        //System.out.println(one.b);
        System.out.println(one.a);
    }
}

class A{
    int a;
    private int b;
    public int c;
}
