package pers.xuetang9.line.chapter3;

import java.util.Scanner;

/**
 * 从键盘输入3个整数，分别赋给整型变量a、b、c，
 * 然后将输入的整数按照从小到大的顺序放在变量a、b、c中，
 * 并输出三个变量的值。
 * @author 念梦
 * @data 2019年7月14日 下午3:18:59
 */
public class PrintValue {
	public static void main(String[] args) {
		int a,b,c;		//从键盘输入的三个整数
		int temp;		//用于交换数字的临时变量
		System.out.println("请输入三个变量的值：");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();	//从键盘输入的第一个整数
		b = input.nextInt();	//从键盘输入的第二个整数
		c = input.nextInt();	//从键盘输入的第三个整数
		input.close();			//释放资源
		if (a > b) {			//如果第一个数大于第二个数则交换 
			temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {			//如果第二个数大于第三个数则交换
			temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {			//如果第一个数大于第二个数则交换
			temp = a;
			a = b;
			b = temp;
		}
		System.out.printf("三个变量的值分别为：%d\t%d\t%d" , a , b , c);
	}
}
