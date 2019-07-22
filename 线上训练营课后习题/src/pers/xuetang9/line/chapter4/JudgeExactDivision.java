package pers.xuetang9.line.chapter4;

import java.util.Scanner;

/**
 * 判断一个数能被几个9整除
 * @author 念梦
 * @data 2019年7月17日 下午12:59:30
 */
public class JudgeExactDivision {
	public static void main(String[] args) {
		int num;			//用户要输入的数字
		int numNine = 0;	//能被数字9整除的个数

		System.out.println("请输入一个整数：");
		Scanner input = new Scanner(System.in);
		while(!input.hasNextInt()) {
			System.out.println("输入的数字不是整型，请重新输入：");
			//hasNextInt判断不是整型后，缓存中还是存在用户输入的内容
			//如果再次使用hasNextInt..判断，仍会得出不是整型的结果
			//所以在这里单独使用input.next()，以便将缓存清除掉
			input.next(); 
		}
		num = input.nextInt();
		System.out.println("您输入的整型数字是：" + num);
		while (num >= 9 || num <= -9) {		//循环判断
			if(num % 9 == 0) {				//判断是否能被9整除	
				numNine++;					//累加器
			}
			num /= 9;						//循环更新
		}
		System.out.println("最多能被" + numNine + "个9整除");
        input.close();			//释放资源
	}
}
