import java.util.List;
import java.util.LinkedList;

public class ReverseLinkedList {

        public ListNode reverseList(ListNode head) {

            ListNode previous = null, next;
            ListNode current = head;

            while(current != null){
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }

            return previous;

        }

}
