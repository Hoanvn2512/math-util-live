
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
//ta viết class để cung cấp tiện ích cho nơi khác xài 
//khi ta cung cấp tiện ích cho nơi khác xài , đó là lúc ta k cần nhớ cái gì
//cho riêng ta, hàm static giúp ta làm điều này
public class MathUtil {
    
    //n! = 1.2.3.4.5...n
    //quy ước : 0! = 1! = 1, ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long , kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    // nếu đưa vào âm, 21 giai thừa -> ko tính đc 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        //hàm dừng k cần return
        
        //xuống đây là n = 0..20 
        if(n == 0 || n ==1)
            return 1; //dừng ngay khi n đặc biệt
        
        //xuống đây , n= 2..20 
        // chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất 
        //i=2 , i=3, i=4, i=5, i=n nhồi liên tục i vào tích 
        long product =1; //tích khởi dầu =1, nhồi 2 3 4 5 6 7 8 ..n 
        
        for (int i = 2; i <= n; i++)
            product *= i; //product = product đang có nhân con i , đập ngược trở lại
            //product = product * i ; //nhồi liên tục product
            // nhân từ 2 đến
        return product;
    }
}
