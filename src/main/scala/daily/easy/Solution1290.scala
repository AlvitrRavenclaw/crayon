package daily.easy

// Definition for singly-linked list.
class ListNode(var _x: Int = 0) {
    var next: ListNode = _
    var x: Int = _x
}

object Solution1290 {

    def getDecimalValue(head: ListNode): Int = {
        var ans: Int = 0
        var p: ListNode = head;
        while (p != null) {
            ans = (ans * 2) + p.x
            p = p.next
        }
        return ans
    }

    def main(args: Array[String]): Unit = {
        var head: ListNode = new ListNode(1)
        head.next = new ListNode(0)
        head.next.next = new ListNode(1)
        assert(getDecimalValue(head) == 5)
    }
}
