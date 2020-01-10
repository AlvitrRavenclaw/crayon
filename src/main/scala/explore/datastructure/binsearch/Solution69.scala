package explore.datastructure.binsearch

object Solution69 {
//    // solution 1
//    def mySqrt(x: Int): Int = {
//        if (x <= 1) {
//            return x;
//        }
//
//        var (l, r): (Long, Long) = (1, x / 2 + 1);
//        while (l + 1 < r) {
//            println(l, r);
//            var (l2, r2): (Long, Long) = (l * l, r * r);
//            if (l2 == x) {
//                return l.toInt;
//            }
//            if (r2 == x) {
//                return r.toInt;
//            }
//            var m = l + (r - l) / 2;
//            var m2 = m * m;
//            if (m2 == x) {
//                return m.toInt;
//            } else if (m2 > x) {
//                r = m;
//            } else {
//                l = m;
//            }
//        }
//        return l.toInt;
//    }

    // solution 2
//    def mySqrt(x: Int): Int = {
//        if (x == 0) {
//            return 0;
//        }
//        if (x > 0 && x < 4) {
//            return 1;
//        }
//        var (l, r): (Long, Long) = (1, x / 2);
//        while (l < r) {
//            var m: Long = (l + r + 1) / 2;
//            if (m * m == x) {
//                return m.toInt;
//            } else if (m * m < x) {
//                l = m;
//            } else {
//                r = m - 1;
//            }
//        }
//        return l.toInt;
//    }

    // solution 3
    def mySqrt(x: Int): Int = {
        if (x == 0) {
            return 0;
        }
        if (x <= 3) {
            return 1;
        }
        var (l, r): (Int, Int) = (1, x / 2);
        while (l < r) {
            var m: Int = l + (r - l) / 2;
            // 变乘为除，天秀
            if (m > x / m) {
                r = m - 1;
            } else {
                if (m + 1 > x / (m + 1)) {
                    return m;
                }
                l = m + 1;
            }
        }
        return l;
    }

    def main(args: Array[String]): Unit = {
        assert(mySqrt(0) == 0);
        assert(mySqrt(1) == 1);
        assert(mySqrt(2) == 1);
        assert(mySqrt(3) == 1);
        assert(mySqrt(4) == 2);
        assert(mySqrt(5) == 2);
        assert(mySqrt(6) == 2);
        assert(mySqrt(7) == 2);
        assert(mySqrt(8) == 2);
        assert(mySqrt(9) == 3);
        assert(mySqrt(10) == 3);
        assert(mySqrt(2147395599) == 46339);
    }
}
