package daily.middle

object Solution814 {

    def pruneTree(root: TreeNode): TreeNode = {
        if (root == null) {
            return null
        }
        if (root.left != null) {
            root.left = pruneTree(root.left)
        }
        if (root.right != null) {
            root.right = pruneTree(root.right)
        }
        if (root.value == 0 && root.left == null && root.right == null) {
            return null
        }
        return root
    }

    def main(args: Array[String]): Unit = {

    }
}
