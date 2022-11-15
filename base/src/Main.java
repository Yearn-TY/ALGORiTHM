import tree.Node;

import java.util.ArrayList;
import java.util.List;

import static tree.Tree.*;

/**
 * @author all
 */
public class Main {

    public static void main(String[] args) {
        List<Node> list = new ArrayList<>();
        Node head = initNode(new Node(), 3);
        inorderTraversal(head, list);
        for (Node node : list) {
            System.out.print(node.getValue() + " ");
        }
        System.out.println();
        List<Node> list2 = new ArrayList<>();
        preorderTraversal(head, list2);
        for (Node node : list2) {
            System.out.print(node.getValue() + " ");
        }
        System.out.println();
        List<Node> list3 = new ArrayList<>();
        postorderTraversal(head, list3);
        for (Node node : list3) {
            System.out.print(node.getValue() + " ");
        }
    }



}
