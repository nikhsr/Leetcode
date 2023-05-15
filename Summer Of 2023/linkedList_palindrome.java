/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class Solution {
    public class ListNode {
            int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

     //This will take O(2n) time
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        if(head.next==null){return true;}
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int b = list.size()-1;
        for(int i=0;i<(list.size())/2;i++){
            if(list.get(i)!=list.get(b-i)){
                return false;
            }
        }
        return true;
    }
    //O(n) time complexity and O(1) space complexity
    
}