package daily.easy

object Solution1313 {
    def decompressRLElist(nums: Array[Int]): Array[Int] = {
        var ans = Array[Int]();
        if (nums.length == 0) {
            return ans
        }
        var (i, j): (Int, Int) = (0, 1);
        while (i < nums.length && j < nums.length) {
            for (_ <- 1 to nums(i)) {
                ans :+= nums(j)
            }
            i += 2
            j += 2
        }
        return ans
    }

    def main(args: Array[String]): Unit = {
        var ans: Array[Int] = decompressRLElist(Array[Int](1, 2, 3, 4))
        println(ans.mkString(" "))
        assert(ans sameElements Array[Int](2, 4, 4, 4));
    }
}
