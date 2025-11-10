/* Linked list Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class GfG {
    public static Node deleteAllOccurances(Node head, int x) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = head;
        Node prev = dummy;

        while (curr != null){
            if (curr.data == x){
                    prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}