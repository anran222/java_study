package java15_0320;
/*
 *@Author:anran
 *@Date:2020/8/21
 *@Version 1.0
 * Map常见操作
 */

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        //1、创建Map实例，泛型参数有两个，第一个参数是key的类型，第二个参数是value的类型
        //key-value这种结构最主要的就是根据key找到对应的value
        Map<String,String> map=new HashMap<>();
        //2、使用size方法获取到元素个数
        System.out.println(map.size());
        System.out.println();
        //3、使用isEmpty查看当前是否为空
        System.out.println(map.isEmpty());
        System.out.println();
        //4、使用put方法把一些键值对存放进去
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        map.put("入云龙","公孙胜");
        //5、使用get方法根据key来查找对应德value
        System.out.println(map.get("及时雨"));
        System.out.println(map.get("玉麒麟"));
        //如果不存在则返回null
        System.out.println(map.get("大刀"));
        System.out.println();
        //6、通过contains（key）和contains（value）判断某个值是否存在
        //contains（value）执行效率比较高，而contains（value）执行效率低
        System.out.println(map.containsKey("智多星"));
        System.out.println(map.containsValue("吴用"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println();
        //for each遍历Map中所有键值对\
        //Map中元素顺序和插入元素无关,取决于具体的实现方式
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
