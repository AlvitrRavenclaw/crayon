package daily.middle

object Solution199 {
    def rightSideView(root: TreeNode): List[Int] = {
        var ans = List[Int]()
        if (root == null) {
            return ans
        }
        var queue = collection.mutable.Queue[TreeNode](root)
        while (queue.nonEmpty) {
            var len: Int = queue.length
            var tmp: Int = -1
            for (_ <- 0 until len) {
                var node: TreeNode = queue.dequeue()
                tmp = node.value
                if (node.left != null) {
                    queue.enqueue(node.left)
                }
                if (node.right != null) {
                    queue.enqueue(node.right)
                }
            }
            ans :+= tmp
        }
        return ans
    }

    def main(args: Array[String]): Unit = {
        var root: TreeNode = new TreeNode(1)
        root.left = new TreeNode(2)
        root.right = new TreeNode(3)
        root.left.right = new TreeNode(5)
        root.right.right = new TreeNode(4)
        assert(rightSideView(root) equals List[Int](1, 3, 4))
    }
}
