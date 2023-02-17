package com.giaolang.mathutil.core.main;

import com.giaolang.mathutil.core.mathutils.MathUtils;

/**
 *
 * @author
 */
public class Main {

    public static void main(String[] args) {
        // ACTUAL là thực tế kết quả chạy ra 
        // EXPECTED là kết quả mà ta hi vọng nó sẽ trả về 
        // framework để kiểm thử phần mềm là Unit Test

        // # test case 1
        long expected = 1;
        long actual = MathUtils.getFactorial(0);
        System.out.println("0! -> expected: " + expected + " actual: " + actual);

        // # test case 2
        expected = 720;
        actual = MathUtils.getFactorial(6);
        System.out.println("6! -> expected: " + expected + " actual: " + actual);
        
         // # test case 2
        expected = 1; 
        actual = MathUtils.getFactorial(-5); // phải ném ra ngọại lệ thì chương trình mới cho ra kết quả đúng  
        System.out.println("Exception! -> expected: " + expected + " actual: " + actual);
   
    }

}
