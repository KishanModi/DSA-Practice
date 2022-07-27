//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         HashSet<Integer> set = new HashSet<>();
         Node curr = head;
         Node prev = null;
         while(curr!=null){
             if(!set.contains(curr.data)){
                 set.add(curr.data);
                 prev = curr;
                 curr = curr.next;
             }else{
                prev.next = curr.next;
                curr =curr.next;
             }
         }
         return head;
    }
}
