package com.giaolang.mathutil.core.mathutils;

/**
 *
 * @author
 */
public class MathUtils {

    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            //trả ra 1 ngoại lệ thông báo cho người dùng 
            throw new IllegalArgumentException("Invalid agrument n must be than 0 and n low 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1;

        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
