package pers.xuetang9.line.chapter5;

import java.util.Scanner;

/**
 * 猜价格游戏
 * @author 念梦
 * @data 2019年7月19日 下午5:24:44
 */
public class GuessPrice {
	public static void main(String[] args) {
		int guessPrice;				//用户猜的价格
		final int price = 5000;		//要猜测的神秘商品的的价格
		int num = 0;				//用户猜测的次数
		char answer;				//判断用户是否有资格参与抽奖
		System.out.println("本店现举办有奖优惠活动，凡在本店购物满一千的客户可凭购物小票，"
				+ "参与猜神秘商品价格获得奖品！");
		System.out.println("请问您是否有购物满一千的小票？（有/无）");
		Scanner input = new Scanner(System.in);
		answer = input.next().charAt(0);		//输入是否有购物小票
		if(answer == '有') {
			for(int i = 0; i < 5; i++) {		//五次以内抽中有奖
				num++;		//每次循环抽奖次数加1
				System.out.println("请输入您所猜测的价格（第"+ num +"次）：");
				guessPrice = input.nextInt();	//输入用户猜测的价格
				if(guessPrice > price) {
					System.out.println("您猜测的价格偏大了");
				}else if(guessPrice < price) {
					System.out.println("您猜测的价格偏小了");
				}else {
					System.out.println("恭喜你猜对了！你一共用了" + num + "次");
					switch (num) {			//判断用户获得什么奖品
					case 1:
						System.out.println("您将获得iPhone8S Plus Plus土豪金一台！");
						break;
					case 2:
					case 3:
						System.out.println("您将获得华为（HUAWEI）荣耀手环zero一个");
						break;
					default:
						System.out.println("您将获得小米蓝牙耳机青春版一副");
					}
				}
				if(num == 5 && guessPrice != price){	//如果到第五次还没猜对
					System.out.println("抱歉，您猜测的次数已达五次，没有获得奖品，请下次再来吧！");
				}
				if(guessPrice == price)		//如果猜对了结束系统
					System.exit(0);
			}
		}else {
			System.out.println("您的购物尚未满一千，不能参与抽奖！");
		}
		input.close(); //释放资源
	}
}
