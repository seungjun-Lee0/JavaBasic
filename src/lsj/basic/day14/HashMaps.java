package lsj.basic.day14;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // hashmap
        // data structure that embody map interface
        // structure that save Entry object which is composed of value and key
        // value can be replicated, but not key
        // key is saved by using hashing
        // better performance on searching bulk data

        // hash value: code that summarized file features
        // in order to prove equality of copied digital proof
        // able to know modification and integrity of file through hash value
        // major hash algorithm : CRC32, MD5, SHA-1
        // fileformat.info/tool/hash.htm

        Map<String, String> names = new HashMap<>();
        names.put("H","혜교");
        names.put("S","수지");
        names.put("J","지현");

        // output value : get(key)
        System.out.println(names.get("S"));
        System.out.println(names.get("J"));
        System.out.println(names);

        // output whole value : use keySet()
        // takes long time when output bulk data
        for(String k : names.keySet()){
            System.out.println(names.get(k) + " ");
        }
        System.out.println();

        // output whole value : use entrySet() (recommendation)
        // use getValue(), getKey() to output key and value
        for(Map.Entry<String, String> e:names.entrySet()){
            System.out.println(e.getValue() + " ");
        }

        // find specific data : containsKey, containsValue
        System.out.println(names.containsKey("H"));
        System.out.println(names.containsValue("혜교"));

        // replace value : no set
        // after 'remove' the value and 'put' new value
        names.remove("H");
        names.put("h", "혜교");
        
        // or use replace method
        names.replace("h", "혜교", "주현");
                
        
        System.out.println(names);
    }
}

