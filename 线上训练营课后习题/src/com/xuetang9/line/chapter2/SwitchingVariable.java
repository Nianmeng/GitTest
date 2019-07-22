package com.xuetang9.line.chapter2;
/**
 * 小明左右手分别拿两张牌：黑桃10和红心8，现交换手中的牌。
 * 程序模拟过程
 * @author 念梦
 * @data 2019年7月11日 下午2:19:28
 *
 */
public class SwitchingVariable {
	public static void main(String[] args) {
		int leftCard = 10;		//交换前左手中的纸牌
		int rightCard = 8;		//交换前右手中的纸牌
		System.out.println("输出互换前手中的纸牌：");
		System.out.println("左手中的纸牌：" + leftCard);
		System.out.println("右手中的纸牌：" + rightCard);
		int temp;				//临时变量
		temp = leftCard;		//将左手牌赋给临时变量
		leftCard = rightCard;	//将右手牌赋给左手牌变量
		rightCard = temp;		//将临时变量赋给右手牌变量
		System.out.println("输出交换后手中的纸牌：");
		System.out.println("左手中的纸牌：" + leftCard);
		System.out.println("右手中的纸牌：" + rightCard);
	}
}
