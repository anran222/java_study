import java.util.*;

/**
 * @Author:xiang
 * @Date:2020/4/13 22:50
 *  前K个高频单词
 */
public class TopKFrequent {
    static class MyComparator implements Comparator<String> {
        private Map<String, Integer> map;

        public MyComparator(Map<String, Integer> map) {
            this.map = map;
        }

        @Override
        public int compare(String o1, String o2) {
            int count1 = map.get(o1);
            int count2 = map.get(o2);
            if (count1 == count2) {
                // String 自身也实现了Comparable, 自带字典序的比较功能的
                // compareTo 就是在使用 String 默认的比较规则
                return o1.compareTo(o2);
            }
            // o1 < o2 返回 < 0
            // o1 > o2 返回 > 0
            // o1 == o2 返回 0
            // count1 - count2 升序排序
            // count2 - count1 降序排序
            // 或者换种理解方式:
            // sort 就是按照升序来排序(小的放前, 大的放后)
            // 这两样的表达式是在重新定义 "什么叫做小"
            // count1 - count2 就是定义了出现次数少的比较小.
            // count2 - count1 就是定义了出现次数多的比较小
            return count2 - count1;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        // 1. 先统计每个单词出现的次数
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            Integer count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }
        // 2. 把刚才这里的统计到的字符串内容放到 ArrayList 中
        // keySet 相当于得到了一个 Set, Set 中存放的就是所有的 key
        ArrayList<String> arrayList = new ArrayList(map.keySet());
        // 3. 按照刚才字符串出现次数, 针对 arrayList 进行排序
        //    sort 默认是按照元素的自身大小进行升序排序(String 的字典序)
        //    此处我们需要按照 字符串 出现次数来降序排序. 也就需要通过比较器自定制比较规则
        // Collections.sort(arrayList, new MyComparator(map));

        // 下面的代码创建了一个 "匿名内部类"
        // 你不知道这个类名字是啥, 但是你知道这个类实现了 Comparator 接口
        // 啥时候需要使用? 这个类只需要用一次, 用完就丢了. 这时候就可以用匿名内部类.
//        Collections.sort(arrayList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int count1 = map.get(o1);
//                int count2 = map.get(o2);
//                if (count1 == count2) {
//                    return o1.compareTo(o2);
//                }
//                return count2 - count1;
//            }
//        });
        // lambda 表达式. 本质上就是一个匿名方法.
        // o1 o2 的类型就是 String 类型.
        Collections.sort(arrayList, (o1, o2) -> {
            int count1 = map.get(o1);
            int count2 = map.get(o2);
            if (count1 == count2) {
                return o1.compareTo(o2);
            }
            return count2 - count1;
        });
        return arrayList.subList(0, k);
    }

    static class MyEntry<K, V> {
        K key;
        V value;

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }
    }

    static class MyComp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }
}
