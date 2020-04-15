package binarysearchtree;

/**
 * @Author:xiang
 * @Date:2020/4/15 23:07
 * 删除元素
 */
public class Remove {
    private Node root=null;
    public boolean remove(int key) {
        // 先找到要删除节点的位置, 再进行具体的删除
        // 找到这个待删除元素后, 再去判定是 a - f 中的哪种情况
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (key < cur.key) {
                parent = cur;
                cur = cur.left;
            } else if (key > cur.key) {
                parent = cur;
                cur = cur.right;
            } else {
                // 找到要删除元素, 就是 cur 指向的节点
                // 在这个方法中去判定 a - f 这些情况并进行删除
                removeNode(parent, cur);
                return true;
            }
        }
        return false;
    }

    private void removeNode(Node parent, Node cur) {
        if (cur.left == null) {
            // 1. 要删除的元素没有左子树
            if (cur == root) {
                // 1.1 如果要删除节点为 root
                root = cur.right;
            } else if (cur == parent.left) {
                // 1.2 cur 是 parent 的左子树, 对应画图板的情况 a
                // 如果 cur 也没有右子树, 相当于
                // parent.left = null
                parent.left = cur.right;
            } else {
                // 1.3 cur 是 parent 的右子树, 对应画图板的情况 b
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            // 2. 要删除的元素没有右子树
            if (cur == root) {
                // 2.1 如果要删除节点是 root
                root = cur.left;
            } else if (cur == parent.left) {
                // 2.2 要删除节点是父节点的左子树, 对应画图板的情况 c
                parent.left = cur.left;
            } else {
                // 2.3 要删除节点是父节点的右子树, 对应画图板的情况 d
                parent.right = cur.left;
            }
        } else {
            // 3. 当前要删除节点有两个子树. 对应画图板的 e 和 f
            // 1) 先找到右子树中的最小元素(替罪羊)
            Node goatParent = cur;  // 替罪羊节点的父节点
            Node scapeGoat = cur.right; // 替罪羊节点
            while (scapeGoat.left != null) {
                goatParent = scapeGoat;
                scapeGoat = scapeGoat.left;
            }
            // 循环结束时, scapeGoat 指向了右子树中的最小值
            // 2) 把刚才找到的替罪羊的值赋给待删除节点.
            cur.key = scapeGoat.key;
            // 3) 删除替罪羊节点
            //    替罪羊节点一定没有左子树(和情况 a 和 b 类似)
            if (scapeGoat == goatParent.left) {
                goatParent.left = scapeGoat.right;
            } else {
                goatParent.right = scapeGoat.right;
            }
        }
    }

}
