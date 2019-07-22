package com.xuetang9.line.chapter2;

import java.util.Scanner;

/**
 * 编写程序实现将华氏温度转换为摄氏温度并显示
 * 从控制台录入温度信息
 * @author 念梦
 * @data 2019年7月11日 下午2:48:26
 *
 */
public class Temperature {
	public static void main(String[] args) {
		double fahrenheit;		//华氏温度
		double centigrade;		//摄氏温度
		Scanner input = new Scanner(System.in);
		System.out.println("请输入当前的华氏温度：");
		fahrenheit = input.nextDouble();
		input.close();
		centigrade = (fahrenheit - 32) * 5 / 9;
		System.out.println("当前的温度为：\t" + centigrade + "℃");
		System.out.println("\t\t" + fahrenheit + "℉");
	}
}
