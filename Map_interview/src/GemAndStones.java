import java.util.HashSet;
import java.util.Set;

/**
 * @Author:xiang
 * @Date:2020/4/13 22:48
 * 宝石与石头
 */
public class GemAndStones {
    public int numJewelsInStones(String J, String S) {
        // 1. 先遍历 J 把所有的宝石类型加入到一个 Set 中
        Set<Character> set = new HashSet<>();
        for (char c : J.toCharArray()) {
            set.add(c);
        }
        // 2. 遍历 S 拿到每个元素取 set 中查找, 如果能找到就说明是宝石
        int ret = 0;
        for (char c : S.toCharArray()) {
            if (set.contains(c)) {
                ret++;
            }
        }
        return ret;
    }
}
