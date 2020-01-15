package daily.middle

class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
}


object Solution1302 {
    def deepestLeavesSum(root: TreeNode): Int = {
        var ans: Int = 0
        if (root == null) {
            return 0
        }
        var queue = collection.mutable.Queue[TreeNode](root)
        while (queue.nonEmpty) {
            var (sum, len): (Int, Int) = (0, queue.length)
            for (i <- 0 until len) {
                var node: TreeNode = queue.dequeue()
                sum += node.value
                if (node.left != null) {
                    queue.enqueue(node.left)
                }
                if (node.right != null) {
                    queue.enqueue(node.right)
                }
            }
            ans = sum
        }
        return ans
    }

    def main(args: Array[String]): Unit = {
        var root: TreeNode = new TreeNode(1)
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4)
        root.left.right = new TreeNode(5)
        root.right.right = new TreeNode(6)
        root.left.left.left = new TreeNode(7)
        root.right.right.right = new TreeNode(8)

        assert(deepestLeavesSum(root) == 15)
    }
}
