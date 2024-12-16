package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        scanner.close();

        int result = 0;
        int position = 1; // 从个位开始计数

        while (number > 0) {
            int digit = (int)(number % 10)
                    ; // 获取当前最低位的数字
            boolean isDigitOdd = (digit % 2 != 0); // 判断数字的奇偶性
            boolean isPositionOdd = (position % 2 != 0); // 判断位置的奇偶性

            if (isDigitOdd == isPositionOdd) {
                result += (1 << (position - 1)); // 对应二进制位值为2^(position-1)
            }

            number /= 10; // 去掉最低位
            position++; // 移动到下一位
        }

        System.out.println(result);
    }
}
