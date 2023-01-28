public class 两数相加 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        //链表赋值
        int[] I1 = {2,5,7};
        int[] I2 = {6,7,8};
        ListNode l1 = new ListNode();
        add(l1,I1);
        ListNode l2 = new ListNode();
        add(l2,I2);
//        System.out.println(l2.val);
        ListNode result = addTwoNumbers(l1,l2);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static void add(ListNode l,int[] I){
        l.val = I[0];
        for (int i=1;i<I.length;i++){
            ListNode n = new ListNode(I[i]);
            l.next = n;
            l = n;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1), pre = dummyHead;
        int t = 0;
        while (l1 != null || l2 != null || t != 0) {
            if (l1 != null) {
                t += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                t += l2.val;
                l2 = l2.next;
            }
            pre.next = new ListNode(t % 10);
            pre = pre.next;
            t /= 10;
        }

        return dummyHead.next;
    }
}
