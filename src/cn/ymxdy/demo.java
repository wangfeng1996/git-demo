package cn.ymxdy;

import java.util.HashSet;

/**
 * @author wf
 * @date 2022/10/17 14:28
 * @description
 */
public class demo {
    public static void main(String[] args) {
        System.out.println("hello -world");
        System.out.println("dev");
        HashSet<String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");

        HashSet<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("7");
        set2.add("3");
        set2.add("9");

        HashSet<String> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        System.out.println(set);
    }
    int a = 3;
}
