package binarysearchtree;

/**
 * @Author:xiang
 * @Date:2020/4/15 23:05
 * 查找元素
 */
public class Find {
    private Node root = null;

    public Node find(int key) {
        // 查找 key 是否在树中存在. 如果存在返回对应的 Node
        Node cur = root;
        while (cur != null) {
            if (key < cur.key) {
                // 就去左子树中找
                cur = cur.left;
            } else if (key > cur.key) {
                // 就去右子树中找
                cur = cur.right;
            } else {
                // 相等就是找到了
                return cur;
            }
        }
        // 循环结束了也没找到, key 就不存在.
        return null;
    }
}
