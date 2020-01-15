package explore.datastructure.binsearch

object Solution34 {
    def searchRange(nums: Array[Int], target: Int): Array[Int] = {
        if (nums.length == 0) {
            return Array[Int](-1, -1);
        }
        var (i, j): (Int, Int) = (0, nums.length - 1);
        var m = i + (j - i) / 2;
        while (i < j && nums(m) != target) {
            if (nums(i) == target || nums(j) == target) {
                m = if (nums(i) == target) i else j;
            } else {
                if (nums(m) < target) {
                    i = m + 1
                } else {
                    j = m - 1
                }
                m = i + (j - i) / 2;
            }
        }
        if (nums(m) == target) {
            var l, r = m;
            while (l - 1 > -1 && nums(l - 1) == target) {
                l -= 1
            }
            while (r + 1 < nums.length && nums(r + 1) == target) {
                r += 1
            }
            return Array[Int](l, r);
        }
        return Array[Int](-1, -1);
    }

    def main(args: Array[String]): Unit = {
        //        var result1: Array[Int] = searchRange(Array[Int](5, 7, 7, 8, 8, 10), 8)
        //        println(result1.mkString(" "));
        //        assert(result1 sameElements Array[Int](3, 4));
        //
        //        var result2: Array[Int] = searchRange(Array[Int](5, 7, 7, 8, 8, 10), 6)
        //        println(result2.mkString(" "));
        //        assert(result2 sameElements Array[Int](-1, -1));
        //
        //        var result3: Array[Int] = searchRange(Array[Int](2, 2), 1)
        //        println(result3.mkString(" "));
        //        assert(result3 sameElements Array[Int](-1, -1));

        //        var result4: Array[Int] = searchRange(Array[Int](1, 2, 3), 2)
        //        println(result4.mkString(" "));
        //        assert(result4 sameElements Array[Int](1, 1));

        var result5: Array[Int] = searchRange(Array[Int](1, 2, 3, 3, 3, 3, 4, 5, 9), 3)
        println(result5.mkString(" "));
        assert(result5 sameElements Array[Int](2, 5));
    }
}
