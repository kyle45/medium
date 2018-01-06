package com.nowcoder; // namespace in cpp

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Main {
    public static void print(int index, Object obj){
        System.out.println(String.format("%d, %s", index, obj.toString()));
    }
    public static void demoOperation(){
        print(1, 5 + 2);
        print(2, 5 - 2);
        print(3, 5 * 2);
        print(4, 5 << 2);
        print(5, 5 >> 2);
    }

    public static void demoString(){
        String str = "hello nowcoder";
        print(1, str.indexOf('l'));
        print(2, str.charAt(0));

    }
    public static void listDemo(){
        List<String> strList = new ArrayList<String>();
        for(int i = 0; i < 4; ++i){
            strList.add(String.valueOf(i));
        }
        print(1, strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }

        });
        print(1, strList);

    }
    public static void demoSet(){
        Set<String> strSet = new HashSet<String>();
        for(int i = 0; i < 3; ++i){
            strSet.add(String.valueOf('1'));
        }
        print(1, strSet);
    }
    public static void demoKeyValue(){
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < 10; ++i){
            map.put(String.valueOf(i), String.valueOf(i*i));
        }
        print(1, map);
        for(Map.Entry<String, String> entry : map.entrySet()){
            print(2, entry.getKey() + ":" + entry.getValue());

        }
    }
    public static void demoException(){
        try{
            print(1, "hello");
            String a = null;
            a.indexOf('a');
        } catch (NullPointerException npe){
            //logger()
            print(3, "NPE");
        } finally{
            print(2, "finally");
        }
    }
    public static void demoClass(){
        Animal animal = new Human("Jim", 28, "USA");
        animal.say();
    }
    public static void main(String[] args) {
	    // write your code here
        //System.out.println("hello nowcoder");
        //print(1, "hello nowcoder!!");
        //demoOperation();
        //demoString();
        //listDemo();
        //demoSet();
        //demoKeyValue();
        //demoException();
        demoClass();
    }

}
