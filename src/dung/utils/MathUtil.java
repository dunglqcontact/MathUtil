/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dung.utils;

/**
 *
 * @author Dung
 */
//đây là class chứa các hàm toán học thì ta tự viết, mục đích là công cụ xài 
//chung cho mọi nơi. Phàm cái gì mà được thiết kế để dùng chung, ta dùng kĩ 
//thuật static
public class MathUtil {

    //tính n! = 1.2.3....n vì n! tăng rất nhanh, sẽ tràn int sớm,, int chỉ tới
    //tối đa 2 tỷ 1, nên mình xài long an toàn hơn, 15! cao lắm rồi, tối đa 15!
    public static long computeFactorial(int n) {

        //nếu người dùng nhập ngu quá, ta sẽ ném ra ngoại lệ
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Nhập ngu quá nhập lại đi, số nhập phải không nhỏ hơn 0 và không lớn hơn 15");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        //đứa nào xài else ở đây , trừ điểm
        return n * computeFactorial(n - 1); //đệ quy nè 
                                            //n! = n * (n-1)!
    }
}
