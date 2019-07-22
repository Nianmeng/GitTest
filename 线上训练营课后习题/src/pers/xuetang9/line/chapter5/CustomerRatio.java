package pers.xuetang9.line.chapter5;

import java.util.Scanner;

/**
 * 商场为提高销售额，需要对顾客的年龄层次（30岁之上或之下）
 * 进行调查（采样10次），计算这两个层次的顾客比例
 * @author 念梦
 * @data 2019年7月18日 下午8:03:12
 */
public class CustomerRatio {
	public static void main(String[] args) {
		int age;			//顾客的年龄
		int bigAge = 0;		//大于30岁的人数
		int smallAge = 0;	//小于30岁的人数
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("请输入第" + (i + 1) + "位顾客的年龄：");
			while(!input.hasNextInt()) {	//判断输入是否合法
				System.out.println("您输入的年龄不合法，请重新输入：");
				input.next();		//清缓存
			}
			age = input.nextInt();	//输入顾客的年龄
			if(age < 0) {			//当输入年龄为负数时
				System.out.println("0岁以下？你在逗我玩吗？再给你一次选择的机会!");
				i--;				//循环次数减一
				continue;			//跳过本次循环
			}
			if(age > 30) {
				bigAge++;			//当顾客年龄大于30时计数bigAge +1
			}else if (age < 30) {
				smallAge++;			//当顾客年龄小于30时计数smallAge +1
			}else {					//当顾客年龄等于30时，忽略
				System.out.println("您输入的年龄为30，本系统将自动忽略！");
			}
		}
		System.out.println("30岁之上的顾客与30岁之下的顾客的比例为："
				+ bigAge + " : " + smallAge);
		input.close();		//释放资源
	}
}
