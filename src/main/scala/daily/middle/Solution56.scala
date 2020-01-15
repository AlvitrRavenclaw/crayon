package daily.middle

object Solution56 {
    def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {
        var ans = Array[Array[Int]]()
        if (intervals.length <= 1) {
            return intervals
        }
        var sortedIntervals = intervals.sortBy(array => array(0))

        var (a, b): (Int, Int) = (sortedIntervals(0)(0), sortedIntervals(0)(1))
        for (i <- 1 until sortedIntervals.length) {
            var (p, q): (Int, Int) = (sortedIntervals(i)(0), sortedIntervals(i)(1))
            if (p <= b) {
                a = math.min(a, p)
                b = math.max(b, q)
            } else {
                ans :+= Array[Int](a, b)
                a = p
                b = q
            }
        }
        ans :+= Array[Int](a, b)
        return ans
    }

    def main(args: Array[String]): Unit = {
        var case1: Array[Array[Int]] = Array[Array[Int]](
            Array[Int](1, 3),
            Array[Int](15, 18),
            Array[Int](8, 10),
            Array[Int](2, 6)
        )
        println(merge(case1).map(_.mkString(" ")).mkString("\n"))

        var case2: Array[Array[Int]] = Array[Array[Int]](
            Array[Int](1, 4),
            Array[Int](4, 5),
        )
        println(merge(case2).map(_.mkString(" ")).mkString("\n"))
    }
}
