package com.xuetang9.line.chapter2;

import java.util.Scanner;

/**
 * 计算银行到期应支付的本息和
 * @author 念梦
 * @data 2019年7月11日 下午3:21:56
 *
 */
public class InterestRate {
	public static void main(String[] args) {
		float money;				//存入银行的本金
		float interest1 = 0.0225f;	//存入银行一年的年利率
		float interest2 = 0.027f;	//存入银行两年的年利率
		float interest3 = 0.0324f;	//存入银行三年的年利率
		float interest5 = 0.036f;	//存入银行五年的年利率
		float total1;				//一年后银行应支付的本息和
		float total2;				//两年后银行应支付的本息和
		float total3;				//三年后银行应支付的本息和
		float total5;				//五年后银行应支付的本息和
		System.out.println("请输入您要存入银行的金额：");
		Scanner input = new Scanner(System.in);
		money = input.nextFloat();
		input.close();
		total1 = money * (1 + interest1);
		total2 = money * (1 + interest2);
		total3 = money * (1 + interest3);
		total5 = money * (1 + interest5);
		System.out.println("一年后本息和为：" + total1);
		System.out.println("两年后本息和为：" + total2);
		System.out.println("三年后本息和为：" + total3);
		System.out.println("五年后本息和为：" + total5);
	}
}
