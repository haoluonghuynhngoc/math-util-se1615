
package com.giaolang.mathutil.core.main;


// import com.giaolang.mathutil.core.mathutils.MathUtils.*;
import com.giaolang.mathutil.core.mathutils.MathUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class MathUtilTest {

    // nếu muốn sài hàm static thì có 2 cách 
    // cách 1 :  tên class. tên hàm 
    // cách 2 : không gọi tên class mà gọi thẳng tên hàm nhưng phải import static package
    
    // # Test case 1 
    @Test // biến 1 hàm trong 1 class bất kì thành main
    public void testFactorialGivenValidArgumentReturnsWell() {
        long expected = 10;
        long actual = MathUtils.getFactorial(0);
        
        assertEquals(expected, actual);
    }
    
    // # Test case 2 
    @Test // biến 1 hàm trong 1 class bất kì thành main
    public void testFactorialGivenValidArgumentN6ReturnsWell() {
        long expected = 720;
        long actual = MathUtils.getFactorial(6);
        
        assertEquals(expected, actual);
    }
    
        // # Test case 3 
    //vì là ngoại lệ nên không thể so sánh nó có bằng nhau hay không
    // nên chỉ có check nó có xuất hiện hay không 
    @Test(expected = IllegalArgumentException.class )
    public void testFactorialGivenValidArgumentThrowException() {
        MathUtils.getFactorial(-5);
    }

}
