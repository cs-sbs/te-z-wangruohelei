    package org.example;

import java.util.Scanner;

class NumberFeature {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            scanner.close();

            int result = 0; // 输出结果
            Scanner in = new Scanner(System.in);
            // 你的代码逻辑

            int position = 1; // 从个位开始，即1号位

            while (number > 0) {
                int digit = number % 10; // 获取最后一位数字
                int digitParity = digit % 2; // 0表示偶数，1表示奇数
                int positionParity = position % 2; // 0表示偶数位置，1表示奇数位置

                if (digitParity == positionParity) {
                    result += position; // 如果奇偶性一致，加上当前位置的二进制值
                }

                number /= 10; // 去掉最后一位数字，继续处理下一位
                position *= 2; // 移到下一位，二进制值乘以2
            }


            System.out.println(result);
        }
    }
