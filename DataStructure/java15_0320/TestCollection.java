package java15_0320;
/*
 *@Author:anran
 *@Date:2020/8/21
 * Collection基本操作
 *@Version 1.0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollection {

    //进行了向上转型，实际new的是ArrayList，使用Collection类型的引用来保存这个对象
    //泛型：写一个方法/类，让这个方法/类可以支持多种不同类型的数据
    /*
        泛型参数必须是引用类型
     */
    public static void main(String[] args) {
        //1、创建Collection方法
        Collection<String> collection=new ArrayList<>();
        //2、使用size方法
        System.out.println(collection.size());
        System.out.println();
        //3、使用isEmpty
        System.out.println(collection.isEmpty());
        System.out.println();
        //4、使用add方法插入元素
        //插入类型必须和泛型类型保持一致
        collection.add("我");
        collection.add("爱");
        collection.add("java");
        //5、再次使用size和isEmpty
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        System.out.println();
        //6、可以使用toArray把Collection装换成数组
        //得到的结果是Object[]
        Object[] array=collection.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println();
        //7、可以直接使用for each循环遍历
        //如果使用普通的循环，需要使用迭代器
        for (String s: collection) {
            //s就会分别指向collection中的每一个元素
            System.out.println(s);
        }
        System.out.println();
        //8、使用contains判定元素是否存在
        System.out.println(collection.contains("我"));
        System.out.println();
        //9、使用remove来删除某个元素
        collection.remove("我");
        for (String s:collection) {
            System.out.println(s);
        }
        System.out.println();
        //使用clear清空所有元素
        collection.clear();
        System.out.println(collection.size());
    }

}
