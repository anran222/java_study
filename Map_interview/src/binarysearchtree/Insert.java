package binarysearchtree;

/**
 * @Author:xiang
 * @Date:2020/4/15 23:06
 * 插入元素
 */
public class Insert {
    private Node root=null;
    public boolean insert(int key) {
        if (root == null) {
            // 当前如果为空树, 直接让 root 指向 key 对应的新节点即可.
            root = new Node(key);
            return true;
        }
        // 和查找类似, 需要先找到合适的位置. 再去插入元素
        Node cur = root;
        Node parent = null;  // parent 始终指向 cur 的父节点. 和链表插入类似. 链表插入元素也需要记录指定位置的前一个元素
        while (cur != null) {
            if (key < cur.key) {
                parent = cur;
                cur = cur.left;
            } else if (key > cur.key) {
                parent = cur;
                cur = cur.right;
            } else {
                // 如果当前树村的只是 key, 发现相同的 key 就认为插入失败.
                // 如果当前树存的是键值对, 发现相同的 key 就修改值即可.
                return false;
            }
        }
        // 循环结束的时候, cur 就指向 null, 当前元素就要插入到 parent 的子树位置上.
        // 具体是插到 parent 的左子树还是右子树呢? 就那 key 和 parent 再比较一次就知道了
        if (key < parent.key) {
            // 插入到 parent 的左侧
            parent.left = new Node(key);
        } else {
            parent.right = new Node(key);
        }
        return true;
    }
}
