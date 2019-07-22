package pers.xuetang9.line.chapter4;

import java.util.Scanner;

/**
 * 从键盘输入一个整数，当输入1-7时，显示其英文缩写
 * 输入其他数字提示用户重新输入，输入数字0时结束程序
 * @author 念梦
 * @data 2019年7月17日 下午7:45:07
 */
public class JudgeWeek {
	public static void main(String[] args) {
		int num;	//用户输入的数字
		System.out.println("请从键盘上输入一位整数，输入数字0退出程序：");
		Scanner input = new Scanner(System.in);
		while(!input.hasNextInt()) {		//判断用户输入的是否是整型
			System.out.println("输入的数字不是整型，请重新输入：");
			input.next(); 					//清除缓存
		}
		num = input.nextInt();
		while(num != 0) {			//当num为0时退出程序
			switch (num) {
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
			case 7:
				System.out.println("SUN");
				break;
			default:
				System.out.println("输入的数字不合法，请重新输入：");
				break;
			}
			num = input.nextInt();				//重新读取用户输入
		}
		input.close(); 				//释放资源
	}
}
