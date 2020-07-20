/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import dung.utils.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dung
 */
public class MathUtilTest {

    //đây là class đặc biệt, chứa các hàm, mà mỗi hàm dùng để test các hàm bên 
    //class của dự án, ví dụ như tét hàm cF() coi chạy đúng không:
    //mỗi hàm sẽ chạy 1 hoặc nhiều lệnh cF() tùy bạn, để kiểm tra coi actual có
    //khớp, ném ra màu xanh
    //không khớp ném ra màu đỏ
    //mỗi hàm sẽ là 1 hàm main() nếu nó mang phía trước một kí hiệu
    //@Test - gọi là annotation
    @Test
    public void testSuccessfullCases() {
        //hàm này dùng để gọi những cF() mà trả về kết quả giai thừa
//        assertEquals(120, 720);

            //expect 1, actual: chờ tính toán khi chạy hàm
            assertEquals(1, MathUtil.computeFactorial(1));
            
            
            //expect 1, actual: chờ tính toán
            assertEquals(1, MathUtil.computeFactorial(0));
            
            assertEquals(2, MathUtil.computeFactorial(2));
            
            assertEquals(6, MathUtil.computeFactorial(3));
            
            assertEquals(720, MathUtil.computeFactorial(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        //hàm này test những tình huống cà chớn
        //người dùng đưa 5!, tình thế éo nào được
        //hàm cF() phải ném về ngoại lệ, một tình huống bất thường,
        //một Exception
        //khốn nạn, Exception ko phải là value để assert();
        //ta phải dùng 1 chiêu khác
        MathUtil.computeFactorial(-5); //ko xài được assertEquals()
        //đưa -5 vào tham số, mình (dev tk ra cF() coi đây là cà nhớn
        //đập vào mặt người đưa con số -5 này vào
        //bằng cách ném ra ngoại lệ IllegalArugmentException
    }
    
}
//đỏ: chỉ cần 1 thằng đỏ là coi như cả đám đỏ, hàm chạy đúng hầy hết các cases
// nhưng chỉ 1 tình huống sai thì coi như sai hết
//xanh: tất cả phải xanh, hàm ý đúng cho mọi tình huống