package lists;


import java.util.ArrayList;

public class Cycle {

    class Node {
             int data;
             Node  next;
        }
    boolean hasCycle(Node head) {

        Node node = head;
        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.add(head);
        while (node != null)
        {
            node = node.next;
            if (nodeList.contains(node))
                return true;
            nodeList.add(node);
        }
        return false;
    }

}
