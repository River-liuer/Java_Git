# Java_Git
Java_基础学习
package com.Method.www;

import java.util.Scanner;

/**
 * @PACKAGE_NAME: com.Method.www
 * @PROJECT_NAME: Java_Git
 * @ClassName: Demo_Fanhuizhi
 * @Date: 2023/4/26 16:01
 * @USER: 1024
 * @Author: 江流儿
 * @Description: 分别定义如下方法：
 * 定义无返回值无参数方法，如打印3行，每行3个*号的矩形
 * 定义有返回值无参数方法，如键盘录入得到一个整数
 * 定义无返回值有参数方法，如打印指定M行，每行N个*号的矩形
 * 定义有返回值有参数方法，如求三个数的平均值
 * @Version: 1.0版本
 */
public class Demo_Fanhuizhi {
    public static void main(String[] args) {
//        One();
//        Two();
//       There(2, 3);
        Four(2,3,5);
    }

    //定义无返回值无参数方法，如打印3行，每行3个*号的矩形
    public static void One() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //定义有返回值无参数方法，如键盘录入得到一个整数
    public static int Two() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int sun = sc.nextInt();
        System.out.println("输入的是：" + sun);
        return 0;
    }

    //定义无返回值有参数方法，如打印指定M行，每行N个*号的矩形
    public static void There(int M, int N) {

        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //定义有返回值有参数方法，如求三个数的平均值
    public static double Four(double X,double Y,double Z){
        double sum = (X+Y+Z)/3;
        System.out.println("平均数："+sum);
        return sum;
    }


}
