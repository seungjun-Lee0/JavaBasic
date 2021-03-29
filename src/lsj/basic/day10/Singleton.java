package lsj.basic.day10;

public class Singleton {
    // singleton class:
    // a class is created in memory only once and make it as an object
    // even if the call of constructor is repeated
    // return only primary created object
    // reuse object so that it prevent waste of memory
    // private constructor, use static variable, principal of getter
    public static void main(String[] args) {
        ServiceOne so1 = new ServiceOne();
        so1.name = "first";
        ServiceOne so2 = new ServiceOne();
        so2.name = "second";

        System.out.println((so1.name + " " + so2.name));
        // so1 and so2 have different values - instance variable

        //ServiceTwo st1 = new ServiceTwo();
        // it is impossible to create object creation
        // because it is private constructor

        ServiceTwo sw1 = ServiceTwo.getInstance();

        sw1.name = "first";
        System.out.println(sw1.name);

        ServiceTwo sw2 = ServiceTwo.getInstance();
        System.out.println(sw2.name);

    }
}

class ServiceOne{
    String name;
    public ServiceOne(){

    }
}

class ServiceTwo{
    private static ServiceTwo st;
    String name;
    private ServiceTwo(){ }
    public static ServiceTwo getInstance(){
        if(st == null){
            // if st object has never been created, creates it
            st = new ServiceTwo();
        }
        return st;
    }
}

