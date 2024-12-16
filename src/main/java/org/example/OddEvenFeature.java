package org.example;

import java.util.Scanner;

public class OddEvenFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int result = 0;
        int position = 1; // 从个位开始，即第1位

        while (number > 0) {
            int digit = number % 10; // 获取当前最低位的数字
            number /= 10; // 移除当前最低位

            // 检查数字和位置的奇偶性是否相同
            if ((digit % 2 == position % 2)) {
                result += (int) Math.pow(2, position - 1); // 如果相同，则在结果中加上对应的二进制位值
            }

            position++; // 移动到下一个数位
        }

        System.out.println(result);
    }
}
