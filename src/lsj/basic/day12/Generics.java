package lsj.basic.day12;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        Lion lion1 = new Lion();
        Tiger tiger1 = new Tiger();
        Zebra zebra1 = new Zebra();

        // declare object type to store any types of value
        Object[] zoo1 = new Object[3];
        zoo1[0] = lion1;
        zoo1[1] = tiger1;
        zoo1[2] = zebra1;

        // however in order to return object from array,
        // type has to be accurate
        ((Lion)zoo1[0]).sayName();
        ((Tiger)zoo1[1]).sayName();
        ((Zebra)zoo1[2]).sayName();

        Object[] numbers1 = new Object[5];
        numbers1[0] = 123;
        numbers1[1] = 456;
        numbers1[2] = 789;

        System.out.println((int)numbers1[0] + (int)numbers1[1] + (int)numbers1[2]);

        ArrayList<Lion> zoo2 = new ArrayList();
        ArrayList<Tiger> zoo3 = new ArrayList();
        ArrayList<Zebra> zoo4 = new ArrayList();

        // type check possible during compiling
        // zoo2.add(new Tiger());
        zoo2.add(new Lion());

        // no need object change in dynamic array list to output value
        Lion l = zoo2.get(0);

        l.sayName();
        // save integer/String in dynamic array list

        // nums1 can only store int type
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(456);
        nums1.add(789);
        System.out.println(nums1.get(0)
                + nums1.get(1) + nums1.get(2));

        // nums2 can only store string type
        ArrayList<String> nums2 = new ArrayList<>();
        nums2.add("123");
        nums2.add("456");
        nums2.add("789");
        // nums2.add(123); type error
        System.out.println(nums2.get(0)
                + nums2.get(1) + nums2.get(2));

    }
}

class Lion {
    public void sayName(){
        System.out.println("lion");
    }
}

class Tiger {
    public void sayName(){
        System.out.println("tiger");
    }
}

class Zebra {
    public void sayName(){
        System.out.println("zebra");
    }
}