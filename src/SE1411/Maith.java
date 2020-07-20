/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE1411;

import static dung.utils.MathUtil.computeFactorial;

/**
 *
 * @author Dung
 */
public class Maith {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("5! = " + computeFactorial(5));
        //tui muốm pik 5 dai thưa chại đúng hem
        // cho nên tui in kết quả xử lí của hàm ra (actual value)
        //tui so sánh nó coi có bằng 120 mà tui tính được hem (expected value)
        //nếu hàm có 1 value trả về (actua - giả sử 120)
        //và khớp với cái tui cần nó phải thế (expected - giả sử mình cần hàm
        //trả về 120)
        //actua khớp với expected, hàm chạy như mong đợi, hàm chạy đúng
        //testing chẳng qua là chạy app, chạy hàm, coi kết quả trả về ccos
        //đúng như mình mo g đợi hay không- actua và expected là như nhau
        //nếu không khớp, code có bug, hoặc mình kì vọng sai

        //expected: 720 mới chịu nhaaaa
        System.out.println("6! = " + computeFactorial(6));

        //expected: 1 mới chịu nhaaaa
        System.out.println("1! = " + computeFactorial(1));

        //cách test kiểu này phải:
        //> chuẩn bị data đầu vào
        //> gọi hàm với data ghi vào
        //> tính trước kết quả trả về từ hàm (actual) với expected = mắt
        //tự đưa ra kết luận -> luận hàm bằng mắt
        //expected: Exception à nhen
        System.out.println("-5! = " + computeFactorial(-5));

        //kĩ thyaatj dùng mắt đối chiếu kết quả ỔN, NHƯNG KHÔNG HIỆU QUẢ
        //vì máy có thể đối chiếu kq được luôn mà, máy so được expected và actual
        // mà
        //GIANG HỒ ĐƯA RA 1 BỘ THƯ VIỆN, 1 FRAMEWORK GIÚP MÌNH
        //TỰ ĐỘNG SO SÁNH 2 KẾT QUẢ EXPECTED VÀ ACTUAL
        //framework này sẽ tự so sánh và đưa ra màu sắc để hàm ý rằng
        //hàm chạy đúng, màu xanh
        //hàm chạy sai,không như kì vọng, màu đỏ
        
        //áp dụng cho 1 loạt data đầu vào
    }

}
