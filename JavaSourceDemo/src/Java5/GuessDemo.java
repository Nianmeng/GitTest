package Java5;

import java.util.Scanner;

/**
 * 猜数字游戏
 * @author 念梦
 * @data 2019年4月14日 下午11:53:55
 *
 */
public class GuessDemo {
	public static void main(String[] args) {
		//用户要猜的数字
		//用户要猜的次数
		final int price = 5000;	//常量,不能更改
		int guessPrice = -1;
		int count = 0;			//用户猜的次数
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入神秘商品的单价：(" + ++count + "次)");
			guessPrice = new Scanner(System.in).nextInt();
		}
		
	}
}
