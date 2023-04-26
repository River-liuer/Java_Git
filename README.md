# Java_Git
Java_基础学习
package com.Method.www;

/**
 * @PACKAGE_NAME: com.Method.www
 * @PROJECT_NAME: Java_Git
 * @ClassName: Demo_CanShu
 * @Date: 2023/4/26 10:11
 * @USER: 1024
 * @Author: 江流儿
 * @Description: 参数传递 - 方法中的参数为形式参数，调用方法时的参数为实际参数
 * @Version: 1.0版本
 */
    //主方法
    public class Demo_CanShu {
        public static void main(String[] args) {
            int x = 5;
            int y = 10; //调用方法时得参数为实际参数

            f1(x, y);
            System.out.println(x);
            System.out.println(y);
    }

    //方法中指定得参数为形式参数
    public static void f1(int x, int y) {
        x = 200;
        y = 500;
    }
}
