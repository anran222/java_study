import java.util.HashMap;
import java.util.Map;

/**
 * @Author:xiang
 * @Date:2020/4/13 22:44
 * 复制带随机指针的链表
 */
public class CopyRandomList {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        // 1. 遍历旧链表, 把旧链表每个节点依次插入到 map 中. key 是旧链表节点, value 是拷贝出来的新节点
        Map<Node, Node> map = new HashMap<>();
        for (Node cur = head; cur != null; cur = cur.next) {
            map.put(cur, new Node(cur.val));
        }
        // 2. 再次遍历链表, 修改新链表节点中的 next 和 random
        for (Node cur = head; cur != null; cur = cur.next) {
            // 先从 map 中找到该 cur 对应的新链表节点
            Node newCur = map.get(cur);
            newCur.next = map.get(cur.next);
            newCur.random = map.get(cur.random);
        }
        // 需要返回新链表的头结点
        return map.get(head);
    }
}
