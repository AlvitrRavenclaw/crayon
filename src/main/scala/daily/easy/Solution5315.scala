package daily.easy

object Solution5315 {
    def maximum69Number (num: Int): Int = {
        var ans: Int = num
        var tmp: Int = num

        var m10: Int = 1
        while (tmp != 0) {
            var rem: Int = tmp % 10
            if (rem == 6) {
                ans = num + 3 * m10
            }
            tmp /= 10
            m10 *= 10
        }
        return ans
    }

    def main(args: Array[String]): Unit = {
        assert(maximum69Number(9669) == 9969)
        assert(maximum69Number(9996) == 9999)
        assert(maximum69Number(9999) == 9999)
    }
}
