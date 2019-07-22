package pers.xuetang9.line.chapter5;

import java.util.Scanner;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天
 * @author 念梦
 * @data 2019年7月18日 下午4:26:37
 */
public class JudgeDay {
	public static void main(String[] args) {
		int year;			//用户要输入的年份
		int month;			//用户要输入的月份
		int day;			//用户要输入的日子
		int total = 0;		//这天是这一年的第几天
		boolean leapYear;	//判断是否为闰年
		System.out.println("请输入年份：");
		Scanner input = new Scanner(System.in);
		//判断用户输入的是否为整型数字
		while(!input.hasNextInt()) {
			System.out.println("您输入的数字不合法，请重新输入：");
			input.next();
		}
		year = input.nextInt();		//录入用户输入的年份
		//判断用户输入的年份是否为闰年
		if (year % 4 == 0 && year %100 != 0 ||year % 400 == 0) {
			leapYear = true;
		}else {
			leapYear = false;
		}
		System.out.println("请输入月份：");
		//判断用户输入的是否为整型数字
		while(!input.hasNextInt()) {
			System.out.println("您输入的数字不合法，请重新输入：");
			input.next();
		}
		month = input.nextInt();	//录入用户输入的月份
		while(true) {				//判断月份输入是否合规
			if(month <= 0 || month > 12) {
				System.out.println("没有这个月份，请用户重新输入：");
				month = input.nextInt();
			}else {
				break;
			}
		}
		System.out.println("请输入日子：");
		//判断用户输入的是否为整型数字
		while(!input.hasNextInt()) {
			System.out.println("您输入的数字不合法，请重新输入：");
			input.next();
		}
		day = input.nextInt();		//录入用户输入的日子
		while(true) {				//判断日子输入是否合规
			if(day <= 0 || day > 31) {
				System.out.println("没有这个日子，请用户重新输入：");
				day = input.nextInt();
			}else {
				break;
			}
		}
		if(leapYear) {			//如果为闰年
			switch (month) {	//根据输入月份进行累加天数
			case 12:
				total += 30;
			case 11:
				total += 31;
			case 10:
				total += 30;
			case 9:
				total += 31;
			case 8:
				total += 31;
			case 7:
				total += 30;
			case 6:
				total += 31;
			case 5:
				total += 30;
			case 4:
				total += 31;
			case 3:
				total += 29;
			case 2:
				total += 31;
			case 1:
				total += day;
			}
		}else {					//如果不是闰年
			switch (month) {	//根据输入月份进行累加天数
			case 12:
				total += 30;
			case 11:
				total += 31;
			case 10:
				total += 30;
			case 9:
				total += 31;
			case 8:
				total += 31;
			case 7:
				total += 30;
			case 6:
				total += 31;
			case 5:
				total += 30;
			case 4:
				total += 31;
			case 3:
				total += 28;
			case 2:
				total += 31;
			case 1:
				total += day;
			}
		}
		System.out.println("您好，这一天是这一年的第" + total + "天");
		System.out.println("感谢您使用本系统，程序结束！");
		input.close();		//释放资源
	}
}
