package daily.easy

object Solution1266 {
    def minTimeToVisitAllPoints(points: Array[Array[Int]]): Int = {
        var ans: Int = 0
        if (points.length == 0) {
            return ans
        }

        var (x, y): (Int, Int) = (points(0)(0), points(0)(1))
        for (i <- 1 until points.length) {
            var (dx, dy): (Int, Int) = (
                math.abs(points(i)(0) - x),
                math.abs(points(i)(1) - y)
            )
            ans += math.max(dx, dy)
            x = points(i)(0)
            y = points(i)(1)
        }
        return ans
    }

    def main(args: Array[String]): Unit = {
        var points1 = Array[Array[Int]](
            Array[Int](1, 1),
            Array[Int](3, 4),
            Array[Int](-1, 0),
        )
        println(minTimeToVisitAllPoints(points1))

        var points2 = Array[Array[Int]](
            Array[Int](3, 2),
            Array[Int](-2, 2),
        )
        println(minTimeToVisitAllPoints(points2))
    }
}
