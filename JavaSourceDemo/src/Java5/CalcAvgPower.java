package Java5;

import java.util.Scanner;

/**
 * 求游戏工会玩家的平均战斗力
 * @author 念梦
 * @data 2019年4月14日 下午8:14:01
 *
 */
public class CalcAvgPower {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int power = 0;	//玩家的战斗力
		int sum = 0;	//累加和
		double avg = 0;	//平均值
		//输入三个战力，求平均值
		for (int i = 0; i < 3; i++) {
			System.out.print("请输入第" + (i + 1) + "位玩家的战斗力：");
			power = input.nextInt();
			sum += power;
		}
		avg = sum / 3.0;
		System.out.printf("三位玩家的战斗力平均值为：%.2f\n", avg);
		//强烈建议：一个循环最好只做一件事
		//求战力之和
	}

}
