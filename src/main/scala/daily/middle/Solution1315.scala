package daily.middle

object Solution1315 {
    def sumEvenGrandparent(root: TreeNode): Int = {
        var ans: Int = 0;
        if (root == null) {
            return ans
        }
        var queue = collection.mutable.Queue[TreeNode](root);
        while (queue.nonEmpty) {
            var len: Int = queue.length
            for (i <- 0 until len) {
                var node: TreeNode = queue.dequeue()
                var isEven = node.value % 2 == 0
                if (node.left != null) {
                    if (node.left.left != null && isEven) {
                        ans += node.left.left.value
                    }
                    if (node.left.right != null && isEven) {
                        ans += node.left.right.value
                    }
                    if (node.left.left != null || node.left.right != null) {
                        queue.enqueue(node.left)
                    }
                }
                if (node.right != null) {
                    if (node.right.left != null && isEven) {
                        ans += node.right.left.value
                    }
                    if (node.right.right != null && isEven) {
                        ans += node.right.right.value
                    }
                    if (node.right.left != null || node.right.right != null) {
                        queue.enqueue(node.right)
                    }
                }
            }
        }
        return ans
    }

    def main(args: Array[String]): Unit = {
        var root: TreeNode = new TreeNode(6);
        root.left = new TreeNode(7)
        root.right = new TreeNode(8)
        root.left.left = new TreeNode(2)
        root.left.right = new TreeNode(7)
        root.right.left = new TreeNode(1)
        root.right.right = new TreeNode(3)
        root.left.left.left = new TreeNode(9)
        root.left.right.left = new TreeNode(1)
        root.left.right.right = new TreeNode(4)
        root.right.right.right = new TreeNode(5)

        assert(sumEvenGrandparent(root) == 18)
    }
}
