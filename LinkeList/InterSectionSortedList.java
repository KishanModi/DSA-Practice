//https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node list1 = head1;
        Node list2 =head2;
        Node resHead =null;
        Node resCurr=null;
        while(list1!=null && list2!=null){
            if(list1.data==list2.data){
                if(resHead==null){
                    resHead = new Node(list1.data);
                    resCurr = resHead;
                }
                else{
                    Node temp = new Node(list1.data);
                    resCurr.next = temp;
                    resCurr = temp;
                }
                list1 = list1.next;
                list2 = list2.next;
            }
            else if(list1.data<list2.data){
                list1 = list1.next;
            }else{
                list2 = list2.next;
            }
        }
        return resHead;
    }
}
