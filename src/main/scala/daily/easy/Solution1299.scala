package daily.easy

object Solution1299 {
    def replaceElements(arr: Array[Int]): Array[Int] = {
        var ans: Array[Int] = arr.clone()
        var max: Int = -1
        for (i <- arr.indices.reverse) {
            var tmp: Int = arr(i)
            ans(i) = max
            max = math.max(tmp, max)
        }
        return ans
    }

    def main(args: Array[String]): Unit = {
        var arr = Array[Int](17, 18, 5, 4, 6, 1)
        var ans = Array[Int](18, 6, 6, 6, 1, -1)
        println(replaceElements(arr).mkString(" "))
        assert(replaceElements(arr) sameElements ans)
    }
}
