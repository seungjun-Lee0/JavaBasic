package lsj.basic.day12;

import sun.security.ssl.HandshakeOutStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        // collection frameworks
        // group of class that provide the way of process big data easily
        // and efficiently

        // main interface
        // List : input order important, duplication permitted
        // set :  input order not important, duplication not permitted
        // Map : data structure that is composed of key and value, high search speed

        // ArrayList (선형구조)
        // size changeable (dynamic sized array)
        // automatically storage is increased when the storage of list become full
        List<Integer> nums = new ArrayList<>();
        nums.add(123);              // add : add data
        nums.add(456);
        nums.add(789);
        nums.add(1, 000); // add element at specific index

        System.out.println(nums.size());

        System.out.println(nums.get(1));

        // output all elements of list 1
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }

        // output all elements of list 2 (recommendation)
        for( Integer num : nums){
            System.out.print(num + "/");
        }
        System.out.println();

        // output all elements of list 3
        Iterator iter = nums.iterator();
        while (iter.hasNext())
            System.out.print( iter.next() + "/");
        System.out.println();

        // search element of the list
        // contains, return true or false
        // indexOf, return position, -1
        System.out.println(nums.contains(456));
        System.out.println(nums.contains(987));

        System.out.println(nums.indexOf(456));
        System.out.println(nums.indexOf(987));

        // save Member object in the list
        ArrayList<Member> members = new ArrayList<>();

        members.add(new Member("abc", "123"));
        members.add(new Member("abc1", "124"));
        members.add(new Member("def456", "125"));

        // output user information

        //System.out.println(members.get(0).userid.contains("abc"));
        for( Member m : members){
            if (m.userid.equals("def456")){
                System.out.println("데이터 찾음");
                break;
            }
            // System.out.println(m.toString());
            // System.out.println(m.toString().contains("def456"));
        }


    }
}

class Member{
    String userid;
    String passwd;

    public Member(String userid, String passwd) {
        this.userid = userid;
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        String fmt = "{userid:%s, passwd:%s}";
        String result = String.format(fmt, userid, passwd);
        return result;
    }
}

