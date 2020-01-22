package daily.easy

object Solution1252 {
    def oddCells(n: Int, m: Int, indices: Array[Array[Int]]): Int = {
        var ans: Int = 0
        var mat: Array[Array[Int]] = Array.ofDim[Int](n, m);
        for (index <- indices) {
            var (ri, ci): (Int, Int) = (index(0), index(1))
            for (i <- 0 until m) {
                mat(ri)(i) += 1
                ans += (if (mat(ri)(i) % 2 != 0) 1 else -1)
            }
            for (j <- 0 until n) {
                mat(j)(ci) += 1
                ans += (if (mat(j)(ci) % 2 != 0) 1 else -1)
            }
        }
        return ans
    }

    def main(args: Array[String]): Unit = {
        var indices1 = Array[Array[Int]](
            Array[Int](0, 1),
            Array[Int](1, 1)
        )
        assert(oddCells(2, 3, indices1) == 6)

        var indices2 = Array[Array[Int]](
            Array[Int](1, 1),
            Array[Int](0, 0)
        )
        assert(oddCells(2, 2, indices2) == 0)
    }
}
