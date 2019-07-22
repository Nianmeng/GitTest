package pers.xuetang9.line.chapter3;

import java.util.Scanner;

/**
 * 给一个不大于5位的正整数
 * 1、求出它是几位数
 * 2、分别打印每一位的数字
 * @author 念梦
 * @data 2019年7月14日 下午6:20:49
 */
public class Number {
	public static void main(String[] args) {
		int num;				//用户要输入的数字
		int numCount;			//用户输入数字的位数
		int unitsDigit;			//个位数
		int tensDigit;			//十位数
		int hundredsDigit;		//百位数
		int thousandDigit;		//千位数
		int tenThounsandDigit;	//万位数
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您要输入的数字：");
		num = input.nextInt();	//用户输入数字
		input.close();			//释放资源
		String nums = num + "";	//转化为字符串
		numCount = nums.length();	//读取数字的长度
		if (numCount > 5) {			//判断用户输入的数字是否合法
			System.out.println("您输入的数字不合法，系统自动退出！");
			System.exit(0);			//如果不合法退出程序
		}
		System.out.println("您输入数字的位数为：" + numCount);
		switch (numCount) {			//判断每一位上的数字是多少
		case 5:
			tenThounsandDigit = num / 10000;
			System.out.println("万位上的数字为：" + tenThounsandDigit);
		case 4:
			thousandDigit = num / 1000 % 10;
			System.out.println("千位上的数字为：" + thousandDigit);
		case 3:
			hundredsDigit = num / 100 % 10;
			System.out.println("百位上的数字为：" + hundredsDigit);
		case 2:
			tensDigit = num / 10 % 10;
			System.out.println("十位上的数字为：" + tensDigit);
		case 1:
			unitsDigit = num % 10;
			System.out.println("个位上的数字为：" + unitsDigit);
		default:
			break;
		}
	}
}
