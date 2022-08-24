//package src.Linkedlist;
//
//class revListInGroupOfGivensize {
//
//    static Node revListInGroupOfGivenSize(Node head, int k){
//        Node h=head;
//        int i=0;
//        while(i<k && h!=null){
//            h=reverse(h,k);
//            h.next=revListInGroupOfGivenSize(h,k);
//        }
//    }
//    static Node reverse(Node h,int k){
//        int i=0;
//        Node curr=h;
//        Node prev=null;
//        Node nxt=head;
//        while(curr!=null && i<k){
//            nxt=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//        return(prev);
//    }
//
//
//
//}
