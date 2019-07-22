package pers.xuetang9.line.chapter4;

import java.util.Scanner;

/**
 * 输入一批整数，输出其中的最大值和最小值，输入数字0结束循环
 * @author 念梦
 * @data 2019年7月17日 下午5:12:51
 */
public class JudegSize {
	public static void main(String[] args) {
		int maxNum = 0;		//输入的最大值
		int minNum = 0;		//输入的最小值
		int num;			//用户输入的数
		int temp = 0;		//临时变量
		int count = 0;		//计数
		System.out.println("请输入一批整数，输入数字0退出：");
		Scanner input = new Scanner(System.in);
		while((num = input.nextInt()) != 0) {		//用户循环输入
			count++;						//计数器
			if(count == 1) {				//输入次数为一时
				minNum = num;				//将数字赋给最大值
				maxNum = num;				//将数字赋给最小值
			}
			if(count == 2) {				//输入次数为2时
				temp = num;					//将数字赋给临时变量
			}
			if(count > 1) {					//当输入次数大于1时
				if(temp < minNum) {			//当下个数大于最小值时
					minNum = temp;			//将下个数赋给最小值
				}
				if(temp > maxNum) {			//当下个数大于最大值时
					maxNum = temp;			//将下个数赋给最大值
				}
				temp = num;					//将下个数赋给临时变量
			} 
		}
		System.out.println(minNum + "\t" + maxNum);
		input.close(); 			//释放资源
	}
}
