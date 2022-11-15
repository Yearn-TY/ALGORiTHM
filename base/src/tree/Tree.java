package tree;

import java.util.List;

/**
 * @author all
 * @date 2022/11/15 13:48
 */

public class Tree {

    public static Node initNode(Node head, int layer){
        if (layer < 0) {
            return null;
        }
        head.setValue(layer);
        head.setLeft(initNode(new Node(), --layer));
        head.setRight(initNode(new Node(), layer));
        return head;
    }

    public static void inorderTraversal(Node head, List<Node> inOrderList) {
        if (head == null) {
            return;
        }
        inorderTraversal(head.getLeft(), inOrderList);
        inOrderList.add(head);
        inorderTraversal(head.getRight(), inOrderList);
    }

    public static void preorderTraversal(Node head, List<Node> inOrderList) {
        if (head == null) {
            return;
        }
        inOrderList.add(head);
        preorderTraversal(head.getLeft(), inOrderList);
        preorderTraversal(head.getRight(), inOrderList);
    }
    public static void postorderTraversal(Node head, List<Node> inOrderList) {
        if (head == null) {
            return;
        }
        postorderTraversal(head.getLeft(), inOrderList);
        postorderTraversal(head.getRight(), inOrderList);
        inOrderList.add(head);
    }
}
