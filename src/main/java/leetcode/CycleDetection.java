package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 */


// * Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class CycleDetection {

    /*
     * A Cycle doesn't neccessarily mean pointing to the head node
     * It can point to any node
     *
     * My Solution using Hash
     */
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;

        ListNode traversalPointer = head.next;
        Map<ListNode, Integer> visitedNodes = new HashMap<ListNode, Integer>();
        visitedNodes.put(head,1);
        while (traversalPointer != null){
            if (visitedNodes.containsKey(traversalPointer))
                return true;
            visitedNodes.put(traversalPointer,1);
            traversalPointer = traversalPointer.next;
        }

        return false;
    }
}
