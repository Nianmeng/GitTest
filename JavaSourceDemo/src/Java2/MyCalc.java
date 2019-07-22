package Java2;

import java.util.Scanner;

/**
 * 实现简单的计算器功能：加减乘除取模
 * @author 念梦
 * @data 2019年4月14日 下午7:17:18
 *
 */
public class MyCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1,num2,result;	//两个操作数和一个结果变量
		String op = "";				//运算符，初值为空字符串
		String choice = null;		//用户的选择：是否继续
		do{
			System.out.println("请输入两个操作数");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.print("请输入运算符：");
			op = input.next();
			//根据运算符的判断，进行相应的计算
			switch (op) {
			case "+":
				result = num1 + num2;
				break;

			default:
				break;
			}
			System.out.print("是否继续计算？(y/)");
			choice = input.next();
		}while("y".equalsIgnoreCase(choice));

	}

}
