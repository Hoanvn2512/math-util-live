/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author hoanv
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5); //hàm tính đi coi là mấy 
        
        System.out.println("expected: 5! = 120; actual: " + result);
        
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1;   actual: " + MathUtil.getFactorial(0));

        //MathUtil.getFactorial(-5); ném ngoại lệ rồi
        
        //Thêm code sau đầu tiên làm chuyện áy -code lên server 7:27pm 9/5/2024
        System.out.println("expected: 1! = 1;   actual: " + MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6;   actual: " + MathUtil.getFactorial(3));
        
        //kĩ thuật kiểm thử phần mềm : ước lượng xem giá trị trả vè của hàm là gì 
        // expected value : 5!=120 
        //hàm ai đó viết khi chạy thực tế là mấy -actual, giả sử 120 
        //if expected == actual, hàm ngon trong tình huống này 
    }
}
