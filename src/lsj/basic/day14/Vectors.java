package lsj.basic.day14;

import java.util.Arrays;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        // vector
        // identical inner structure with arrayList
        // => permit dynamic array, save order, replicated data
        // able to safely add and delete object in multi thread environment
        // => support synchronisation
        // thus, arrayList does not support synchronisation and
        // it is faster than vector

        // add, get, set, remove

        // definite Vector class and add data
        Vector<String> names = new Vector();
        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add(1, "아이유");

        // initialise dynamic array list by using Array
        Vector<Integer> nums =
                new Vector<>(Arrays.asList(1,2,3,4,5));

        // output data in vector
        for(String name : names){
            System.out.print(name + " ");
        }
        System.out.println();

        for (Integer num : nums){
            System.out.print(num + " ");
        }
        System.out.println();

        // size and storage of vector
        System.out.println(
                names.size() + "/" + names.capacity()
        );

        System.out.println(
                nums.size() + "/" + nums.capacity()
        );

        // output vector elements
        System.out.println(names.get(1));

        // delete vector elements
        names.remove(1);
        names.clear();

        // edit specific vector elements
        nums.add(3, 10);
        nums.set(0, 100);               // set 100 at first element
        System.out.println(nums.get(0) + "/" + nums.get(3));

    }
}
