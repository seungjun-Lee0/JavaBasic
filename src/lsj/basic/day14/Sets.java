package lsj.basic.day14;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        // Set
        // not able to save replicated object
        // not able to maintain order save

        HashSet<String> names = new HashSet<>();
        
        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add("혜교");


        for(String name : names){
            System.out.println(name);
        }

        HashSet<Integer> nums =
                new HashSet<>(Arrays.asList(10,9,8,6,7));

        for(Integer num : nums){
            System.out.println(num);
        }

        // save banana, peach, apple into the Set class

        HashSet<String> fruits = new HashSet<>();

        fruits.add("banana");
        fruits.add("peach");
        fruits.add("apple");

        // process of Set class that distinguish replication
        // get hashcode of object before save the object
        // compare hashcode of stored objects and judge as identical object
        // if there are objects that have same hashcode

        for(String fruit : fruits){
            System.out.print(fruit.hashCode() + " ");
        }
        System.out.println();

        // sort set factors
        // 1. change Set as list
        List<String> fList = new ArrayList(fruits);

        Collections.sort(fList);
        for(String f: fList){
            System.out.print(f + " ");
        }
        System.out.println();

        // output each element of Hashset
        // Set does not support get method
        // but, output individual element by using contains method
        System.out.println(names.contains("혜교"));

        // support remove, clear

    }
}
