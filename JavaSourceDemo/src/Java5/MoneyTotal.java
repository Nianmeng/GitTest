package Java5;

import java.util.Scanner;

/**
 * 循环输入5个玩家的消费，统计消费额低于500的玩家数量
 * 如果消费大于等于500，则跳过；小于500则计数器+1
 * @author 念梦
 * @data 2019年4月20日 下午3:01:32
 *
 */
public class MoneyTotal {

	private static Scanner input;

	public static void main(String[] args) {
		//1. 循环录入5个玩家的消费金额
		//2. 录入后立刻判断是否小于500
		//3. 累加小于500的总次数
		int count = 0;
		double money = Double.MAX_VALUE;	//赋一个不可能的值，方便以后的判断
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入第" + (i + 1) + "位玩家的消费金额：");
			input = new Scanner(System.in);
			money = input.nextDouble();
			if(money >= 500)
				continue;//跳过次数累加
			count++;
		}
		System.out.println("消费总金额小于500的总数为："+ count);
	}
}
