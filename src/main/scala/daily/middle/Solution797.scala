package daily.middle

object Solution797 {
    def allPathsSourceTarget(graph: Array[Array[Int]]): List[List[Int]] = {
        var ans = List[List[Int]]()
        var stack = collection.mutable.Stack[Int](0)
        for (i <- 1 until graph(0).length) {
            stack.push(graph(0)(i))
            if (stack.top == graph.length - 1) {
                ans.appended(stack.clone())
            }
        }
        return ans
    }

    def main(args: Array[String]): Unit = {

    }
}
