package week5.day1.dynamic_ds;

/**
 * Created by serhii on 18.05.15.
 */
public class TestNodeChain {

    public static void main(String[] args) {
        INodeHelper nodeHelper = new NodeHelperImpl();

        Node node4 = new Node(12, null);
        Node node3 = new Node(11, node4);
        Node node2 = new Node(10, node3);

        nodeHelper.printChain(node2);

        // 2 -> 3 -> 4 -> null
        Node head = new Node(10,
                        new Node(11,
                                new Node(15,
                                        new Node(68,null))));
        nodeHelper.printChain(head);

        Node head2 = null;
        for (int i = 0; i < 5; i++) {
            head2 = new Node(i,head2);
        }

        nodeHelper.printChain(head2);

//        INodeHelper nodeHelper2 = new NodeHelperImpl();
        //System.out.println(nodeHelper.toString(head));

        System.out.println("*************");
        System.out.println("test creation");

        Node head3 = nodeHelper.create(1,2,3,4,5,6);
        System.out.println(nodeHelper.toString(head3));


    }

}
